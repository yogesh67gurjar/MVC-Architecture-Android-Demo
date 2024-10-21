package com.yogesh.mvcdemo

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyController(var apiListener: ApiListener) {

    private var apiService: ApiService = Retrofit
        .Builder()
        .baseUrl("https://catfact.ninja/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)


     fun getFact() {
        apiService.getFact().enqueue(object : Callback<CatFactResponse> {
            override fun onResponse(
                call: Call<CatFactResponse>,
                response: Response<CatFactResponse>
            ) {
                response.body()?.let {
                    apiListener.onSuccess("CatFactResponse", it)
                }

            }

            override fun onFailure(call: Call<CatFactResponse>, t: Throwable) {
                t.message?.let {
                    apiListener.onFailure(it)
                }
            }
        })
    }
}