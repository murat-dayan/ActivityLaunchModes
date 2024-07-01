package com.muratdayan.launchmodes.singleinstancce

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivityFirstSingleInstanceBinding

class FirstSingleInstanceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstSingleInstanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstSingleInstanceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnOpenSecondSingleInstanceActivity.setOnClickListener {
            startActivity(Intent(this, SecondSingleInstanceActivity::class.java))
        }

    }
}