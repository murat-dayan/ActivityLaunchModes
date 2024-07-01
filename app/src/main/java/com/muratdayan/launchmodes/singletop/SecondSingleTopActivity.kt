package com.muratdayan.launchmodes.singletop

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.muratdayan.launchmodes.databinding.ActivitySecondSingleTopBinding

class SecondSingleTopActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondSingleTopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondSingleTopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenFirstSingleTopActivity.setOnClickListener {
            startActivity(Intent(this, FirstSingleTopActivity::class.java))
        }

        binding.btnOpenSecondSingleTopActivity.setOnClickListener {
            startActivity(Intent(this, SecondSingleTopActivity::class.java))
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent", Toast.LENGTH_SHORT).show()
    }

}