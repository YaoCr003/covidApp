package com.example.kotlin.covidapp.data.network

import com.example.kotlin.covidapp.data.network.model.CovidAppObject
import com.example.kotlin.covidapp.data.network.model.covidapp.CovidApp
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CovidAPIService {

    //https://api.api-ninjas.com/v1/covid19?country=canada
    @GET("covid19")
    suspend fun getPokemonList(
        @Query("country") limit:String
    ): CovidAppObject

    //https://api.api-ninjas.com/v1/covid19?{country}
    @GET("covid19{country}")
    suspend fun getPokemonInfo(
        @Path("country") nCountry:String
    ): CovidApp
}