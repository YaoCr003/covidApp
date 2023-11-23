package com.example.kotlin.covidapp.data.network.model

import com.google.gson.annotations.SerializedName

data class CovidAppBase(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
)
