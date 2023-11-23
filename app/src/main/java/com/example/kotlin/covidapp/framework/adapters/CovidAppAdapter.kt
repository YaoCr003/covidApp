package com.example.kotlin.covidapp.framework.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.covidapp.data.network.model.CovidAppBase
import com.example.kotlin.covidapp.framework.viewholders.CovidAppViewHolder

class CovidAppAdapter: RecyclerView.Adapter<CovidAppViewHolder>() {

    var data:ArrayList<CovidAppBase> = ArrayList()

    fun PokemonAdapter(basicData : ArrayList<CovidAppBase>){
        this.data = basicData
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidAppViewHolder {
        val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CovidAppViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CovidAppViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}