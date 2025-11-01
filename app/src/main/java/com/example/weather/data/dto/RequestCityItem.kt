package com.example.weather.data.dto

data class RequestCityItem(
    val country: String,
    val lat: Double,
    val lon: Double,
    val name: String,
    val state: String
)