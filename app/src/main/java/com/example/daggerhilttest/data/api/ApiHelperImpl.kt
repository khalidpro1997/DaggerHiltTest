package com.example.daggerhilttest.data.api

import com.example.daggerhilttest.data.model.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService):ApiHelper {

    override suspend fun getUsers(): Response<List<User>> {
        TODO("Not yet implemented")
    }

}