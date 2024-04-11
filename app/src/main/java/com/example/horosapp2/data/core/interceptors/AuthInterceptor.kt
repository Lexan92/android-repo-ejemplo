package com.example.horosapp2.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val tokenManager: TokenManager):Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .header("Autorization",tokenManager.getToken())
            .build()
        return chain.proceed(request)

    }
}

class TokenManager @Inject constructor(){
    fun getToken():String = "12sd56as321asd56sadvnbnr"

}