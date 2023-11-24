package com.example.kotlin.covidapp.framework.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin.covidapp.data.network.model.CovidDia
import com.example.kotlin.covidapp.data.network.model.covidapp.Covid
import com.example.kotlin.covidapp.data.network.model.covidapp.X20200122
import com.example.kotlin.covidapp.domain.CovidInfoRequirement
import com.example.kotlin.covidapp.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val primeroDatosObjectLiveData = MutableLiveData<ArrayList<CovidDia>?>()
    val ultimosDatosObjectLiveData = MutableLiveData<ArrayList<CovidDia>?>()
    private val covidInfoRequirement = CovidInfoRequirement()

    fun getPrimerosDatos(){
        viewModelScope.launch(Dispatchers.IO) {
            val result: Covid? = covidInfoRequirement(Constants.MAX_INFO_COUNTRY)

            if (result == null){
                Log.d("prueba", "hola ${result}")
            }

            val lista = ArrayList<CovidDia>()

            var registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200227?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200227?.total ?: 0
                ),
                fecha = "Feb / 27 / 2020"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200228?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200228?.total ?: 0
                ),
                fecha = "Feb / 28 / 2020"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200301?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200301?.total ?: 0
                ),
                fecha = "Mar / 01 / 2020"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200302?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200302?.total ?: 0
                ),
                fecha = "Mar / 02 / 2020"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200303?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200303?.total ?: 0
                ),
                fecha = "Mar / 03 / 2020"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200304?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200304?.total ?: 0
                ),
                fecha = "Mar / 04 / 2020"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200305?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200305?.total ?: 0
                ),
                fecha = "Mar / 05 / 2020"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200306?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200306?.total ?: 0
                ),
                fecha = "Mar / 06 / 2020"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200307?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200307?.total ?: 0
                ),
                fecha = "Mar / 07 / 2020"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200308?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200308?.total ?: 0
                ),
                fecha = "Mar / 08 / 2020"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200309?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200309?.total ?: 0
                ),
                fecha = "Mar / 09 / 2020"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200310?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200310?.total ?: 0
                ),
                fecha = "Mar / 10 / 2020"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20200311?.new ?: 0,
                    total = result?.get(0)?.cases?.date20200311?.total ?: 0
                ),
                fecha = "Mar / 11 / 2020"
            )
            lista.add(registro)


            CoroutineScope(Dispatchers.Main).launch {
                primeroDatosObjectLiveData.postValue(lista)
            }
        }}

    fun getUltimosDatos(){
        viewModelScope.launch(Dispatchers.IO) {
            val result: Covid? = covidInfoRequirement(Constants.MAX_INFO_COUNTRY)

            val lista = ArrayList<CovidDia>()

            var registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230227?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230227?.total ?: 0
                ),
                fecha = "Feb / 27 / 2023"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230228?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230228?.total ?: 0
                ),
                fecha = "Feb / 28 / 2023"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230301?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230301?.total ?: 0
                ),
                fecha = "Mar / 01 / 2023"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230302?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230302?.total ?: 0
                ),
                fecha = "Mar / 02 / 2023"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230303?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230303?.total ?: 0
                ),
                fecha = "Mar / 03 / 2023"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230304?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230304?.total ?: 0
                ),
                fecha = "Mar / 04 / 2023"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230305?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230305?.total ?: 0
                ),
                fecha = "Mar / 05 / 2023"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230306?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230306?.total ?: 0
                ),
                fecha = "Mar / 06 / 2023"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230307?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230307?.total ?: 0
                ),
                fecha = "Mar / 07 / 2023"
            )

            lista.add(registro)

            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230308?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230308?.total ?: 0
                ),
                fecha = "Mar / 08 / 2023"
            )

            lista.add(registro)
            registro = CovidDia(
                datos = X20200122(
                    new = result?.get(0)?.cases?.date20230309?.new ?: 0,
                    total = result?.get(0)?.cases?.date20230309?.total ?: 0
                ),
                fecha = "Mar / 09 / 2023"
            )

            lista.add(registro)


            CoroutineScope(Dispatchers.Main).launch {
                ultimosDatosObjectLiveData.postValue(lista)
            }
        }}
}