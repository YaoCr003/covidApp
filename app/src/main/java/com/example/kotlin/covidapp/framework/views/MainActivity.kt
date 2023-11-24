package com.example.kotlin.covidapp.framework.views

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.covidapp.data.CovidAppRepository
import com.example.kotlin.covidapp.data.network.model.CovidDia
import com.example.kotlin.covidapp.databinding.ActivityMainBinding
import com.example.kotlin.covidapp.framework.adapters.CovidAppAdapter
import com.example.kotlin.covidapp.framework.adapters.CovidUtAppAdapter
import com.example.kotlin.covidapp.framework.viewModel.MainViewModel
import com.example.kotlin.covidapp.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    private val adapter : CovidAppAdapter = CovidAppAdapter()
    private val adapterUt : CovidUtAppAdapter = CovidUtAppAdapter()
    private lateinit var data:ArrayList<CovidDia>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()

        viewModel.getPrimerosDatos()
        viewModel.getUltimosDatos()

    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initializeObservers(){
        viewModel.primeroDatosObjectLiveData.observe(this) { contenido ->
            if (contenido != null) {
                setUpRecyclerView(contenido)
            }
        }

        viewModel.ultimosDatosObjectLiveData.observe(this){ contenido2 ->
            if ( contenido2 != null ){
                setUpRecyclerViewUlt(contenido2)
            }
        }
    }

    private fun setUpRecyclerView(dataForList:ArrayList<CovidDia>){
        binding.RVCovid.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVCovid.layoutManager = linearLayoutManager
        adapter.CovidAppAdapter(dataForList)
        binding.RVCovid.adapter = adapter
    }

    private fun setUpRecyclerViewUlt(dataForList:ArrayList<CovidDia>){
        binding.RVCovidUlt.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVCovidUlt.layoutManager = linearLayoutManager
        adapterUt.CovidUtAppAdapter(dataForList)
        binding.RVCovidUlt.adapter = adapterUt
    }

}