package com.example.hotncoldwallpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butCool = findViewById<Button>(R.id.coolbtn)
        val butHot = findViewById<Button>(R.id.hotbtn)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        butCool.setOnClickListener {
            linearLayout.setBackgroundColor(0xFF00FF00.toInt())
        }

        butHot.setOnClickListener {
            linearLayout.setBackgroundColor(0xFFFF0000.toInt())
        }
    }
}