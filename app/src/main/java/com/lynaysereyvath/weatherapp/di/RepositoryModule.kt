package com.lynaysereyvath.weatherapp.di

import com.lynaysereyvath.weatherapp.data.location.DefaultLocationTracker
import com.lynaysereyvath.weatherapp.domain.location.LocationTracker
import com.lynaysereyvath.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepository: WeatherRepository): WeatherRepository

}