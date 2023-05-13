package com.example.notesappkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notesappkotlin.R
import com.example.notesappkotlin.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {
    private lateinit var binding:ActivitySecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}