package com.lynaysereyvath.weatherapp.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.lynaysereyvath.weatherapp.data.mappers.toWeatherInfo
import com.lynaysereyvath.weatherapp.data.remote.WeatherApi
import com.lynaysereyvath.weatherapp.domain.repository.WeatherRepository
import com.lynaysereyvath.weatherapp.domain.util.Resource
import com.lynaysereyvath.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(private val api: WeatherApi): WeatherRepository {
    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(lat, long).toWeatherInfo()
            )
        }
        catch (e: Exception)
        {
            e.printStackTrace()
            Resource.Error(e.message ?: "AN unknown error occurred.")
        }
    }
}