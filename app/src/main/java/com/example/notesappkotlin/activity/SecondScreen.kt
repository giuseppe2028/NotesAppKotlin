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
        clickBottoni()
    }

    private fun clickBottoni() {
        //qui inserisco tutti i click dei bottoni
        binding.button2.setOnClickListener {
            binding.sfondoSecondScreen.background = resources.getDrawable(R.color.quarto)
            binding.editTitle.setHintTextColor(resources.getColor(R.color.black))
            binding.editTextText.setHintTextColor(resources.getColor(R.color.black))
        }
        binding.button6.setOnClickListener {
            binding.sfondoSecondScreen.background = resources.getDrawable(R.color.quinto)
            binding.editTitle.setHintTextColor(resources.getColor(R.color.black))
            binding.editTextText.setHintTextColor(resources.getColor(R.color.black))
        }
        binding.button7.setOnClickListener {
            binding.sfondoSecondScreen.background = resources.getDrawable(R.color.primo)
            binding.editTitle.setHintTextColor(resources.getColor(R.color.black))
            binding.editTextText.setHintTextColor(resources.getColor(R.color.black))
        }
        binding.button8.setOnClickListener {
            binding.sfondoSecondScreen.background = resources.getDrawable(R.color.secondo)
            binding.editTitle.setHintTextColor(resources.getColor(R.color.black))
            binding.editTextText.setHintTextColor(resources.getColor(R.color.black))
        }
        binding.button9.setOnClickListener {
            binding.sfondoSecondScreen.background = resources.getDrawable(R.color.terzo)
            binding.editTitle.setHintTextColor(resources.getColor(R.color.black))
            binding.editTextText.setHintTextColor(resources.getColor(R.color.black))
        }
    }
}