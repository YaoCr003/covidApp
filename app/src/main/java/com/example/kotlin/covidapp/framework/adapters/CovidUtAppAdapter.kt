package com.example.kotlin.covidapp.framework.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.covidapp.data.network.model.CovidDia
import com.example.kotlin.covidapp.databinding.ItemCovidultBinding
import com.example.kotlin.covidapp.framework.adapters.viewholders.CovidAppUtViewHolder

class CovidUtAppAdapter : RecyclerView.Adapter<CovidAppUtViewHolder>() {
    var data:ArrayList<CovidDia> = ArrayList()
    fun CovidUtAppAdapter(basicData : ArrayList<CovidDia>){
        this.data = basicData
    }
    override fun onBindViewHolder(holder: CovidAppUtViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidAppUtViewHolder {
        val binding = ItemCovidultBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CovidAppUtViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return data.size
    }

}