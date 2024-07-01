package com.muratdayan.launchmodes.singletop

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivityFirstBinding
import com.muratdayan.launchmodes.databinding.ActivityFirstSingleTopBinding
import com.muratdayan.launchmodes.standard.SecondActivity

class FirstSingleTopActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstSingleTopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstSingleTopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenSecondSingleTopActivity.setOnClickListener {
            startActivity(Intent(this, SecondSingleTopActivity::class.java))
        }


    }
}