package com.yogesh.mvcdemo

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("fact")
     fun getFact(): Call<CatFactResponse>
}