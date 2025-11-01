package com.example.weather.data.repository

import com.example.weather.data.service.WeatherServerService
import com.example.weather.ui.model.CityWeather

class WeatherReportRepository(private val service: WeatherServerService) {
    suspend fun GetWeatherReport(): List<CityWeather> {
        val reports = service.WeatherReport().body()!!
        val weatherReportView = mutableListOf<CityWeather>()

        for (cityweather in reports) {
            val reportData = CityWeather(
                name = cityweather.name,

            )
        }
    }
}