package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.reflect.KProperty

class LoginViewModel: ViewModel() {
    var userName: String? = null
    private lateinit var password : String
    fun getValue(username:String,passwords:String){
        userName = username
        password = passwords
    }
}