package com.example.kotlin.covidapp.data.network.model

import com.google.gson.annotations.SerializedName

data class CovidAppObject(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<CovidAppBase>,
)
