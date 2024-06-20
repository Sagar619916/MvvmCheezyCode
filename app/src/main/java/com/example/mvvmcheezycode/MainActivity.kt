package com.example.mvvmcheezycode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var txtCounter: TextView
     lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)
        txtCounter = findViewById(R.id.txtCounter)
        setText()
        //Added observer ---
        lifecycle.addObserver(Observer())
        Log.d("MAIN", "Activity OnCreate")
    }

    private fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }
    /* Increment function to Increment counter in viewModel, and setting Text In txtCounter
    * */
    fun increment(v : View){
        mainViewModel.increment()
        setText()
    }

    /*
    * Below code is for observing the lifecycle related to observer class....
    * */

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "Activity OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "Activity OnPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "Activity OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "Activity OnDestroy")
    }
}