package com.example.teymurapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)

        // Button 1 changes text
        button1.setOnClickListener {
            textView.text = "Text changed!"
        }

        // Button 2 changes text color
        button2.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
    }
}
