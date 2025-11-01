package com.example.weather.data.service

import com.example.weather.data.dto.RequestCity
import com.example.weather.data.dto.RequestWeatherReport
import retrofit2.Response
import retrofit2.http.GET

interface WeatherServerService {
    @GET("api/city")
    suspend fun City(): Response<RequestCity>

    @GET("api/weatherreport")
    suspend fun WeatherReport(): Response<RequestWeatherReport>
}