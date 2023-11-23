package com.example.kotlin.covidapp.framework.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.covidapp.data.network.model.CovidAppBase
class CovidAppViewHolder(private val binding: ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: CovidAppBase){
        binding.TVName.text = item.name
    }
}