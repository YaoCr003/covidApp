package com.example.kotlin.covidapp.data.network

import android.util.Log
import com.example.kotlin.covidapp.data.network.model.covidapp.Covid
import com.example.kotlin.covidapp.utils.Constants

class CovidAPIClient {
    private lateinit var api: CovidAPIService

    suspend fun getCovid(country: String): Covid? {
        api = NetworkModuleDI()

        return try {
            api.getCovid(Constants.KEY, country)
        }catch (e: java.lang.Exception){
            e.printStackTrace()
            null
        }

    }
}