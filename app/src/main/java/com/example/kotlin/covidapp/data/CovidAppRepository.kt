package com.example.kotlin.covidapp.data

import com.example.kotlin.covidapp.data.network.CovidAPIService
import com.example.kotlin.covidapp.data.network.NetworkModuleDI
import com.example.kotlin.covidapp.data.network.model.CovidAppObject
import com.example.kotlin.covidapp.data.network.model.covidapp.CovidApp

class CovidAppRepository {
    private lateinit var api: CovidAPIService

    suspend fun getCovidList(limit:String):CovidAppObject?{
        api = NetworkModuleDI()
        return try{
            api.getPokemonList(limit)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }

    }

    suspend fun getCovidInfo(nCountry:String): CovidApp? {
        api = NetworkModuleDI()
        return try{
            api.getPokemonInfo(nCountry)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}