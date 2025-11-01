package com.example.weather.ui.model

data class CityWeather (
    val name: String,
    val weather: String,
    val weatherEmote: Int,
    val tempCelsius: Double,
    val humidity: Int,
    val windKMH: Int,
    val feltTempCelsius: Double,
    val rain: Float,
    val pressure: Int,
    val clouds: Int,
    val sunRiseMin: Int,
    val sunRiseHour: Int,
    val sunRiseTime: String,
    val sunSetMin: Int,
    val sunSetHour: Int,
    val sunSetTime: String
)