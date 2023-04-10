package com.example.daggerhilttest.data.repository

import com.example.daggerhilttest.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}