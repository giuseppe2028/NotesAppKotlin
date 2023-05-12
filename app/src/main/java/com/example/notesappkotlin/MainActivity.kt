package com.example.notesappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notesappkotlin.classes.CustomAdapter
import com.example.notesappkotlin.classes.ItemsViewModel
import com.example.notesappkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var v1:ItemsViewModel = ItemsViewModel("Cose da fare","Mangiare il cioccolato")
    var v2:ItemsViewModel = ItemsViewModel("Cose da mangiare","Mangiare il cioccolato")
    var v3:ItemsViewModel = ItemsViewModel("Ricetta Pizza","Mettere la farina")

   val lista:List<ItemsViewModel> = listOf(v1,v2,v3)
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(lista)
        binding.recyclerView.adapter = adapter
    }
}