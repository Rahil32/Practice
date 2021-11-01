package com.example.practice    //MainActivity -> MainViewModelFactory -> MainViewModel -> MainActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val text = MutableLiveData<String>("Sumanta")
    val set : LiveData<String>
    get() = text
    fun update(){
        text.value = "mm mm"
    }
}