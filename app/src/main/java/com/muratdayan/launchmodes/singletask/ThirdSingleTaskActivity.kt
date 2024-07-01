package com.muratdayan.launchmodes.singletask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivityFirstSingleTaskBinding
import com.muratdayan.launchmodes.databinding.ActivityThirdSingleTaskBinding

class ThirdSingleTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdSingleTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdSingleTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenSecondSingleTaskActivity.setOnClickListener {
            startActivity(Intent(this, SecondSingleTaskActivity::class.java))
        }


    }
}