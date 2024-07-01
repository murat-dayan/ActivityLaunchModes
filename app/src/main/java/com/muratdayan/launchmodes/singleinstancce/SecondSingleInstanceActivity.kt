package com.muratdayan.launchmodes.singleinstancce

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivityFirstSingleInstanceBinding
import com.muratdayan.launchmodes.databinding.ActivitySecondSingleInstanceBinding

class SecondSingleInstanceActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondSingleInstanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondSingleInstanceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnOpenFirstSingleInstanceActivity.setOnClickListener {
            startActivity(Intent(this, FirstSingleInstanceActivity::class.java))
        }

        binding.btnOpenThirdSingleInstanceActivity.setOnClickListener {
            startActivity(Intent(this, ThirdSingleInstanceActivity::class.java))
        }

    }
}