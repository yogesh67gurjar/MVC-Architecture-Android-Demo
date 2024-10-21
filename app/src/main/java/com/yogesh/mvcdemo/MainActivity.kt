package com.yogesh.mvcdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yogesh.mvcdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.oneBtn.setOnClickListener {
            startActivity(Intent(this, OneActivity::class.java))
        }

        binding.twoBtn.setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }
    }
}