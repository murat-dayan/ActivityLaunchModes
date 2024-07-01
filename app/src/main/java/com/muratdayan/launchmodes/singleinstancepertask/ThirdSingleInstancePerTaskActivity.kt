package com.muratdayan.launchmodes.singleinstancepertask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratdayan.launchmodes.R
import com.muratdayan.launchmodes.databinding.ActivitySecondSingleInstancePerTaskBinding
import com.muratdayan.launchmodes.databinding.ActivityThirdSingleInstancePerTaskBinding

class ThirdSingleInstancePerTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdSingleInstancePerTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdSingleInstancePerTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}