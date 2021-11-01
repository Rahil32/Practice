package com.example.practice

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var value: Int = 0

    fun increment(){
        value++
    }

    fun reset(){
        value = 0
    }

}