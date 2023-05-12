package com.example.notesappkotlin.classes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notesappkotlin.databinding.CardBinding

class CustomAdapter(private var lista:List<ItemsViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(binding:CardBinding):RecyclerView.ViewHolder(binding.root){
        val titolo = binding.textView2
        var testo = binding.textView3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = CardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var element = lista[position]
        holder.testo.text = element.text
        holder.titolo.text = element.title
    }
}