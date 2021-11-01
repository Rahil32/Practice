package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var increment : TextView   //instance
    lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increment = findViewById(R.id.textView) //get - xml + instance

    mainViewModel = ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)  //mainViewModel object

        set()   //set + create

    }

    private fun set(){  //set - instance + mainViewModel(var)
        increment.text = mainViewModel.value.toString()
    }


    fun clicked(view:View){   //click
        mainViewModel.increment()
        set()
    }

    fun reset(view: View){  //click
        mainViewModel.reset()
        set()
    }

}