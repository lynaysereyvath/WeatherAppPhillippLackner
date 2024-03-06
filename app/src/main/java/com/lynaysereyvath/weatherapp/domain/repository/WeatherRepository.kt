package com.lynaysereyvath.weatherapp.domain.repository

import com.lynaysereyvath.weatherapp.domain.util.Resource
import com.lynaysereyvath.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}