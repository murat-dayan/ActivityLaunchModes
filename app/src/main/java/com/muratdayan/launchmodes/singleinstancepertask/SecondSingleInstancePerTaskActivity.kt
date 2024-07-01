package com.muratdayan.launchmodes.singleinstancepertask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivityFirstSingleInstancePerTaskBinding
import com.muratdayan.launchmodes.databinding.ActivitySecondSingleInstancePerTaskBinding

class SecondSingleInstancePerTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondSingleInstancePerTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondSingleInstancePerTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenThirdSingleInstancePerTaskActivity.setOnClickListener {
            startActivity(Intent(this, ThirdSingleInstancePerTaskActivity::class.java))
        }

    }
}