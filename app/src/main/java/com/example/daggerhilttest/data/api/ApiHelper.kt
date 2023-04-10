package com.example.daggerhilttest.data.api

import com.example.daggerhilttest.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}