package com.example.shayari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       var inspirational = findViewById<TextView>(R.id.tt3)
        inspirational.setOnClickListener(){
            intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}