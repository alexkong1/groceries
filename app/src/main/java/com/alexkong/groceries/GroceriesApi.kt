package com.alexkong.groceries

import retrofit2.http.GET
import retrofit2.http.Headers

interface GroceriesApi {

    @Headers("Accept: application/json")
    @GET("master/backup")
    suspend fun getSpecials(): Products
}