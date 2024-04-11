package com.example.horosapp2.domain

import com.example.horosapp2.data.network.response.PredictionResponse
import com.example.horosapp2.domain.model.PredictionModel

interface Repository {
    suspend fun  getPrediction(sign:String):PredictionModel?
}