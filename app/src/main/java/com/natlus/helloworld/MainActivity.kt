package com.natlus.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "Info Main Activity")
        Log.d(TAG, "Debug Log")
        Log.e(TAG, "Error log")
        Log.w(TAG,"Warning log")
    }
}