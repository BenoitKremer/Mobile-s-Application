package com.example.firstapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R

class PlantAdapter : RecyclerView.Adapter<PlantAdapter.ViewHolder>(){

    // Boîte de composants à contrôler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
        // image

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal_plant, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}