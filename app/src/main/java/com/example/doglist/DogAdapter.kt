package com.example.doglist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(val imageList:List<String>):RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflador = LayoutInflater.from(parent.context)
        return  DogViewHolder((layoutInflador.inflate(R.layout.item_dog, parent, false)))
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = imageList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}