package com.example.practice    //MainActivity -> MainViewModelFactory -> MainViewModel -> MainActivity

import androidx.lifecycle.ViewModel

class MainViewModel(val num: Int) : ViewModel() {   //num assigned in value
    var value: Int = num

    fun increment(){
        value++
    }

    fun reset(){
        value = 0
    }

}