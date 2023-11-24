package com.example.kotlin.covidapp.framework.adapters.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.covidapp.data.network.model.CovidDia
import com.example.kotlin.covidapp.databinding.ItemCovidBinding

class CovidAppViewHolder(private val binding: ItemCovidBinding) : RecyclerView.ViewHolder(binding.root)  {

    fun bind(item: CovidDia ){
        binding.tvfecha.text ="Fecha: " + item.fecha
        binding.tvnuevos.text ="Nuevos: " + item.datos.new.toString()
        binding.tvtotal.text ="Total: " + item.datos.total.toString()
    }
}