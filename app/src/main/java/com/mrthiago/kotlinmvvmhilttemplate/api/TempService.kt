package com.mrthiago.kotlinmvvmhilttemplate.api

import com.mrthiago.kotlinmvvmhilttemplate.data.TempResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TempService {

    @GET("/api/temp")
    suspend fun getCurrency(
        @Query("name") pramOne: String = "temp"
    ): Response<TempResponse>
}