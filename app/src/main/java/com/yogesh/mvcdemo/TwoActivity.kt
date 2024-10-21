package com.yogesh.mvcdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yogesh.mvcdemo.databinding.ActivityTwoBinding

class TwoActivity : AppCompatActivity(), ApiListener {
    private lateinit var binding: ActivityTwoBinding
    private lateinit var myController: MyController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myController = MyController(this)

        getFact()
    }

    private fun getFact() {
        binding.loader.visibility = View.VISIBLE
        myController.getFact()
    }

    override fun onSuccess(type: String, result: Any) {
        binding.loader.visibility = View.GONE
        if (type == "CatFactResponse") {
            binding.tv.text = (result as CatFactResponse).fact
        }
    }


    override fun onFailure(message: String) {
        binding.loader.visibility = View.GONE
        binding.tv.text = message
    }
}