package com.example.horoskopapp.data.network

import com.example.horoskopapp.data.network.data.HoroskopResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST(".")
    suspend fun getHoroscope(
        @Query("sign") sign: String,
        @Query("day") day: String
    ): Response<HoroskopResponse>


}
//Forzar crash para mostrar interceptors