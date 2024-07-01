package com.muratdayan.launchmodes.singleinstancepertask

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muratdayan.launchmodes.databinding.ActivityFirstSingleInstancePerTaskBinding

class FirstSingleInstancePerTaskActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstSingleInstancePerTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstSingleInstancePerTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenSecondSingleInstancePerTaskActivity.setOnClickListener {
            startActivity(Intent(this, SecondSingleInstancePerTaskActivity::class.java))
        }

    }
}