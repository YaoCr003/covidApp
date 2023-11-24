package com.example.kotlin.covidapp.data

import com.example.kotlin.covidapp.data.network.CovidAPIClient
import com.example.kotlin.covidapp.data.network.CovidAPIService
import com.example.kotlin.covidapp.data.network.NetworkModuleDI
import com.example.kotlin.covidapp.data.network.model.covidapp.Covid

class CovidAppRepository {
    private val api = CovidAPIClient()
    suspend fun getCovid(country: String): Covid? = api.getCovid(country)
}