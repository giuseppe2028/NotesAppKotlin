package com.example.notesappkotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notesappkotlin.activity.SecondScreen
import com.example.notesappkotlin.classes.CustomAdapter
import com.example.notesappkotlin.classes.ItemsViewModel
import com.example.notesappkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //faccio che direttamente chiamo un tipo drawable

    var v1:ItemsViewModel = ItemsViewModel("Cose da fare","Mangiare il cioccolato", 244,184,160)
    var v2:ItemsViewModel = ItemsViewModel("Cose da mangiare","Mangiare il cioccolato",236,240,174)
    var v3:ItemsViewModel = ItemsViewModel("Ricetta Pizza","Mettere la farina",205,161,220)
    var v4:ItemsViewModel = ItemsViewModel("Ricetta Pizza","Mettere la farina",205,161,220)
    var v5:ItemsViewModel = ItemsViewModel("Ricetta Pizza","Mettere la farina",205,161,220)
    var v6:ItemsViewModel = ItemsViewModel("Cose da fare","Mangiare il cioccolato", 244,184,160)
    var v7:ItemsViewModel = ItemsViewModel("Cose da mangiare","Mangiare il cioccolato",236,240,174)
    var v8:ItemsViewModel = ItemsViewModel("Ricetta Pizza","Mettere la farina",205,161,220)
    var v9:ItemsViewModel = ItemsViewModel("Ricetta Pizza","Mettere la farina",205,161,220)
    var v10:ItemsViewModel = ItemsViewModel("Ricetta Pizza","Mettere la farina",205,161,220)

   val lista:List<ItemsViewModel> = listOf(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10)
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(lista)
        binding.recyclerView.adapter = adapter
        binding.floatingActionButton.setOnClickListener{
            click()
        }
    }

    fun click(){
        val i = Intent(this,SecondScreen::class.java)
        startActivity(i)

    }

}