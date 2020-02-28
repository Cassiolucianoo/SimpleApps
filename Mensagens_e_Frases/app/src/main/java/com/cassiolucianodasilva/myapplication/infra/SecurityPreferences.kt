package com.cassiolucianodasilva.myapplication.infra


import android.content.Context
import android.support.v4.media.MediaMetadataCompat

class  SecurityPreferences(context:Context){
    private val mSharedPreferences = context.getSharedPreferences("mensagem", Context.MODE_PRIVATE)

    fun storeString(key:String, value: String){

        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String{
       return mSharedPreferences.getString(key ,"")?: ""
    }

}