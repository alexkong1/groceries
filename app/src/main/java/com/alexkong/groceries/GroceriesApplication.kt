package com.alexkong.groceries

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GroceriesApplication: Application() {

    lateinit var service: GroceriesApi

    override fun onCreate() {
        super.onCreate()
        initService()
    }

    private fun initService() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/Swiftly-Systems/code-exercise-android/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(GroceriesApi::class.java)
    }

    fun getRetrofit(): GroceriesApi {
        return service
    }
}