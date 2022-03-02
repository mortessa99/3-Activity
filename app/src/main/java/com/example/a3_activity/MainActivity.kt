package com.example.a3_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3_activity.databinding.ActivityHomeBinding
import com.example.a3_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnGoApp.setOnClickListener {
            //val intent = Intent(this,HomeActivity::class.java)
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}