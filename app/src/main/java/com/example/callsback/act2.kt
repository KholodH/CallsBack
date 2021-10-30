package com.example.callsback

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class act2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)
        showToast(this,"onCreate Activity 2")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 1")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 1")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 1")
    }

    fun showToast(context: Context, state:String)
    {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }
}

