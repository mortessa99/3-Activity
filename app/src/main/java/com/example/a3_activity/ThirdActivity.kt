package com.example.a3_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3_activity.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        print("aaaaaaaaaaaaaaaaaaaaaaaa")
        binding.textView2.text = intent.getStringExtra("number")
        print("bbbbbbbbbbbbbbbbbbbbbbbbbbb")
    }
}