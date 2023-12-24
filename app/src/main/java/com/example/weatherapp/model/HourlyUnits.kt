package com.example.weatherapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HourlyUnits(
    @Json(name = "temperature_2m")
    val temperature2m: String,
    @Json(name = "time")
    val time: String
)