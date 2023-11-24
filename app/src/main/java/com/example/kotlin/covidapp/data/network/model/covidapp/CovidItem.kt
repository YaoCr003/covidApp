package com.example.kotlin.covidapp.data.network.model.covidapp

data class CovidItem(
    val cases: Cases,
    val country: String,
    val region: String
)