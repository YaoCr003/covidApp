package com.example.kotlin.covidapp.data

import com.example.kotlin.covidapp.data.network.CovidAPIService
import com.example.kotlin.covidapp.data.network.model.CovidAppObject
import com.example.kotlin.covidapp.data.network.model.covidapp.CovidApp

class CovidAppRepository {
    private lateinit var api: CovidAPIService

    suspend fun getPokemonList(limit:String):CovidAppObject?{

        //todo: Inicializar variable api
        return try{
            api.getPokemonList(limit)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }

    }

    suspend fun getPokemonInfo(nCountry:String): CovidApp? {
        //todo: Inicializar variable api
        return try{
            api.getPokemonInfo(nCountry)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}