package com.yogesh.mvcdemo

interface ApiListener {
    fun onSuccess(type: String, result: Any)
    fun onFailure(message: String)
}