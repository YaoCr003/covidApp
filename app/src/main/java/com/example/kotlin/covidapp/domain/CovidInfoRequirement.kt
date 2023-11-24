package com.example.kotlin.covidapp.domain

import com.example.kotlin.covidapp.data.CovidAppRepository
import com.example.kotlin.covidapp.data.network.model.covidapp.Covid
import com.example.kotlin.covidapp.utils.Constants

class CovidInfoRequirement {
    private val repository = CovidAppRepository()

    suspend operator fun invoke(country: String
    ): Covid? = repository.getCovid(country)
}