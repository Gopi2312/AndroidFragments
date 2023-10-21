package com.example.myapplication

import androidx.lifecycle.ViewModel
import kotlin.reflect.KProperty

class LoginViewModel: ViewModel() {
    lateinit var userName:String
    private lateinit var password : String
    fun getValue(username:String,passwords:String){
        userName = username
        password= passwords
    }
}