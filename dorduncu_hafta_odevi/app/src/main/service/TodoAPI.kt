package com.oytuns.myapplication.service

import com.patikadev.deneme1.ui.todo_app.model.User
import com.patikadev.deneme1.ui.todo_app.response.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface TodoAPI {
    @POST("user/register")
    fun register(@Body params : MutableMap<String, Any>) : Call<RegisterResponse>


    @GET("user/me")
    fun getMe() : Call<User>
}