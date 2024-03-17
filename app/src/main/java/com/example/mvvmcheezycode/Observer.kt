package com.example.mvvmcheezycode

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class Observer: DefaultLifecycleObserver {
   override fun onCreate(owner: LifecycleOwner){
        Log.d("MAIN","Observer - ON CREATE")
    }
    override fun onResume(owner: LifecycleOwner) {
        Log.d("MAIN","Observer - ON RESUME")
    }
    override fun onPause(owner: LifecycleOwner) {
        Log.d("MAIN", "Observer OnPause")
    }
    override fun onStop(owner: LifecycleOwner) {
        Log.d("MAIN", "Observer OnStop")
    }
    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("MAIN", "Observer OnDestroy")
    }

}