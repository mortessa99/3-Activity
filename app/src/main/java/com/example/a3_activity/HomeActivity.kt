package com.example.a3_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3_activity.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val valueOfTypedByUser = binding.editTextTextPersonName.text.toString()
            startActivity(Intent(this,ThirdActivity::class.java).putExtra("number","$valueOfTypedByUser"))
        }
    }
}