package com.example.kotlin.covidapp.framework.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.covidapp.data.network.model.CovidDia
import com.example.kotlin.covidapp.databinding.ItemCovidBinding
import com.example.kotlin.covidapp.framework.adapters.viewholders.CovidAppViewHolder

class CovidAppAdapter: RecyclerView.Adapter<CovidAppViewHolder>() {
    var data:ArrayList<CovidDia> = ArrayList()
    fun CovidAppAdapter(basicData : ArrayList<CovidDia>){
        this.data = basicData
    }
    override fun onBindViewHolder(holder: CovidAppViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidAppViewHolder {
        val binding = ItemCovidBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CovidAppViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return data.size
    }

}