package com.cassiolucianodasilva.myapplication.infra


import android.content.Context

class  SecurityPreferences(context:Context){
    private val mSharedPreferences = context.getSharedPreferences("mensagem", Context.MODE_PRIVATE)

    fun storeString(key:String, value: String){

        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key:String, values: String){

    }

}