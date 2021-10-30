package com.example.callsback

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(this,"onCreate Activity 1")
        button1.setOnClickListener {
            intent = Intent(applicationContext, act2::class.java)
            startActivity(intent) }}

        override fun onStart() {
            super.onStart()
            showToast(this,"onStart Activity 1")

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
            Toast.makeText(context,state,Toast.LENGTH_SHORT).show()
        }
    }
