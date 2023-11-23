package com.example.kotlin.covidapp.framework.views

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.covidapp.data.CovidAppRepository
import com.example.kotlin.covidapp.data.network.model.CovidAppBase
import com.example.kotlin.covidapp.databinding.ActivityMainBinding
import com.example.kotlin.covidapp.framework.adapters.CovidAppAdapter
import com.example.kotlin.covidapp.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity: Activity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter : CovidAppAdapter = CovidAppAdapter()
    private lateinit var data:ArrayList<CovidAppBase>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        setUpRecyclerView(testData())

    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    private fun testData():ArrayList<CovidAppBase>{
        var result = ArrayList<CovidAppBase>()

        result.add(CovidAppBase("bulbasaur",""))
        result.add(CovidAppBase("charmander",""))
        result.add(CovidAppBase("squirtle",""))

        return result
    }

    private fun getPokemonList(){
        CoroutineScope(Dispatchers.IO).launch {
            val pokemonRepository = CovidAppRepository()
            val result:CovidAppBase? = pokemonRepository.getCovidList(Constants.MAX_INFO_COUNTRY)
            Log.d("Salida", result?.count.toString())
        }
    }

    private fun setUpRecyclerView(dataForList:ArrayList<CovidAppBase>){
        binding.RVCovid.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVCovid.layoutManager = linearLayoutManager
        adapter.CovidAppAdapter(dataForList)
        binding.RVCovid.adapter = adapter
    }

}