package com.example.weatherapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hourly(
    @Json(name = "temperature_2m")
    val temperature2m: List<Double>,
    @Json(name = "time")
    val time: List<String>
)