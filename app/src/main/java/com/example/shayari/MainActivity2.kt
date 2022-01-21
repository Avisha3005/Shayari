package com.example.shayari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var button = findViewById<View>(R.id.button1) as Button
        button.setOnClickListener(){
            intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}