package com.example.horosapp2.data

import android.util.Log
import com.example.horosapp2.data.network.HoroscopeApiService
import com.example.horosapp2.data.network.response.PredictionResponse
import com.example.horosapp2.domain.Repository
import com.example.horosapp2.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor (private val apiService: HoroscopeApiService): Repository {
    override suspend fun getPrediction(sign: String):PredictionModel? {
        //llamar Retrofit
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("ALEX", "Ha ocurrido un error ${it.message}") }

        return null
    }
}