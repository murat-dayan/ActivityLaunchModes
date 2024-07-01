package com.muratdayan.launchmodes.singletask

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivitySecondSingleTaskBinding
import com.muratdayan.launchmodes.databinding.ActivitySecondSingleTopBinding
import com.muratdayan.launchmodes.singletop.FirstSingleTopActivity
import com.muratdayan.launchmodes.singletop.SecondSingleTopActivity

class SecondSingleTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondSingleTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondSingleTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenFirstSingleTaskActivity.setOnClickListener {
            startActivity(Intent(this, FirstSingleTaskActivity::class.java))
        }

        binding.btnOpenThirdSingleTaskActivity.setOnClickListener {
            startActivity(Intent(this, ThirdSingleTaskActivity::class.java))
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent", Toast.LENGTH_SHORT).show()
    }

}