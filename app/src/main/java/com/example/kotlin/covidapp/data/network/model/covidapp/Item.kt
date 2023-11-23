package com.example.kotlin.covidapp.data.network.model.covidapp

data class Item(
    val name: String,
    val request: Request,
    val response: List<Any>
)