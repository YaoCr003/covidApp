package com.example.kotlin.covidapp.data.network.model.covidapp

import com.google.gson.annotations.SerializedName

data class Cases(
    @SerializedName("2020-02-27") val date20200227: X20200122,
    @SerializedName("2020-02-28") val date20200228: X20200122,
    @SerializedName("2020-03-01") val date20200301: X20200122,
    @SerializedName("2020-03-02") val date20200302: X20200122,
    @SerializedName("2020-03-03") val date20200303: X20200122,
    @SerializedName("2020-03-04") val date20200304: X20200122,
    @SerializedName("2020-03-05") val date20200305: X20200122,
    @SerializedName("2020-03-06") val date20200306: X20200122,
    @SerializedName("2020-03-07") val date20200307: X20200122,
    @SerializedName("2020-03-08") val date20200308: X20200122,
    @SerializedName("2020-03-09") val date20200309: X20200122,
    @SerializedName("2020-03-10") val date20200310: X20200122,
    @SerializedName("2020-03-11") val date20200311: X20200122,
    @SerializedName("2023-02-27") val date20230227: X20200122,
    @SerializedName("2023-02-28") val date20230228: X20200122,
    @SerializedName("2023-03-01") val date20230301: X20200122,
    @SerializedName("2023-03-02") val date20230302: X20200122,
    @SerializedName("2023-03-03") val date20230303: X20200122,
    @SerializedName("2023-03-04") val date20230304: X20200122,
    @SerializedName("2023-03-05") val date20230305: X20200122,
    @SerializedName("2023-03-06") val date20230306: X20200122,
    @SerializedName("2023-03-07") val date20230307: X20200122,
    @SerializedName("2023-03-08") val date20230308: X20200122,
    @SerializedName("2023-03-09") val date20230309: X20200122,
)