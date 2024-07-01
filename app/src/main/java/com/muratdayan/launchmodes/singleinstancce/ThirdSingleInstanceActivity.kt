package com.muratdayan.launchmodes.singleinstancce

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivitySecondSingleInstanceBinding
import com.muratdayan.launchmodes.databinding.ActivityThirdSingleInstanceBinding

class ThirdSingleInstanceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdSingleInstanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdSingleInstanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}