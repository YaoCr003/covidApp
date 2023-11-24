package com.example.kotlin.covidapp.data.network

import com.example.kotlin.covidapp.data.network.model.covidapp.Covid
import com.example.kotlin.covidapp.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface CovidAPIService {

    //https://api.api-ninjas.com/v1/covid19?country=canada
    @GET("covid19")
    suspend fun getCovid(
        @Header(Constants.HEADER) key: String,
        @Query("country") country:String
    ): Covid

}