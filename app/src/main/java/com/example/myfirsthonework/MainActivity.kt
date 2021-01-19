package com.example.myfirsthonework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.Button_1)
        val button2: Button = findViewById(R.id.Button_2)
        val button3: Button = findViewById(R.id.Button_3)

        button1.setOnClickListener{
            Log.e("btn_1", "Clicked Button_1")
        }
        button2.setOnClickListener{
            Log.e("btn_2", "Clicked Button_2")
        }
        button3.setOnClickListener{
            Log.e("btn_3", "Clicked Button_3")
        }
    }
}