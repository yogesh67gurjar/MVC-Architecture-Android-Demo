package com.yogesh.mvcdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yogesh.mvcdemo.databinding.ActivityOneBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class OneActivity : AppCompatActivity() {
    private var apiService: ApiService = Retrofit
        .Builder()
        .baseUrl("https://catfact.ninja/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    lateinit var binding: ActivityOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getFact()
    }

    private fun getFact() {
        binding.loader.visibility = View.VISIBLE
        apiService.getFact().enqueue(object : Callback<CatFactResponse> {
            override fun onResponse(
                call: Call<CatFactResponse>,
                response: Response<CatFactResponse>
            ) {
                binding.tv.text = response.body()?.fact
                binding.loader.visibility = View.GONE
            }

            override fun onFailure(call: Call<CatFactResponse>, t: Throwable) {
                binding.tv.text = t.message
                binding.loader.visibility = View.GONE
            }
        })
    }
}