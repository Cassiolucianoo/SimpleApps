package com.cassiolucianodasilva.mvvm_training

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel()  {

    private var mTextBemvindo = MutableLiveData<String>()
    private var mToastNotification = MutableLiveData<String>()
    private val mPersonRepository = PersonRepository()


    init {
        mTextBemvindo.value = "Oi"
    }

    fun login(): LiveData<String> {
        return mToastNotification
    }

    fun doLogin(email: String,sobre: String) {
        if ((this.mPersonRepository.login(email))and(this.mPersonRepository.sobre(sobre))){
            mToastNotification.setValue("Success")
            mTextBemvindo.value = "Sucesso "
        }



        else{
            mToastNotification.setValue("Campo em branco")
            mTextBemvindo.value = "Em branco"
    }}

    fun welcome(): LiveData<String> {
        return mTextBemvindo
    }



}