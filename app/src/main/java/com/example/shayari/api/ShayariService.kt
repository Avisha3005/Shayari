package com.example.shayari.api

import com.example.shayari.models.Result
import com.example.shayari.models.Shayari
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ShayariService {
    @GET("/quotes?tags=technology,famous-quotes")
    suspend fun getShayaris(@Query("page")page: Int): Response<Shayari>
}