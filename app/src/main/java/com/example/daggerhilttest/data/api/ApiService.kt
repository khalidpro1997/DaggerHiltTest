package com.example.daggerhilttest.data.api

import com.example.daggerhilttest.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUser(): Response<List<User>>

}