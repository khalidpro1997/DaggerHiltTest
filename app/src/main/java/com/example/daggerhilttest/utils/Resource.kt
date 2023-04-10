package com.example.daggerhilttest.utils

//We need a utility class that will be responsible to communicate the current state of Network Call to the UI Layer. We are naming that as Resource. So, create a Kotlin data class Resource inside the same utils package and add the following code.
data class Resource<out T>(val status: Status,val data:T?,val message:String?) {


    companion object{

        fun <T> success(data: T?): Resource<T>{
            return Resource(Status.SUCCESS,data,null)
        }

        fun <T> error(msg:String, data:T?): Resource<T>{
            return Resource(Status.ERROR,data,msg)
        }

        fun <T> loading(data:T?):Resource<T>{
            return Resource(Status.LOADING,data,null)
        }

    }
}