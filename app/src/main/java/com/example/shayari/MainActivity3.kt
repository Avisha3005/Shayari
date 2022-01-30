package com.example.shayari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.shayari.Repository.ShayariRepository
import com.example.shayari.api.RetroHelper
import com.example.shayari.api.ShayariService
import com.example.shayari.models.Result
import com.example.shayari.models.Shayari
import com.example.shayari.viewmodel.MainViewModel
import com.example.shayari.viewmodel.MainViewModelFactory

lateinit var mainViewModel: MainViewModel
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var count = 0
        val btnNext = findViewById<TextView>(R.id.btnNext)
        val shayar = findViewById<TextView>(R.id.tt1)
        val author = findViewById<TextView>(R.id.tt2)
        val shayari = RetroHelper.getInstance().create(ShayariService::class.java)
        val repository = ShayariRepository(shayari)
        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)
        mainViewModel.shayari.observe(this, Observer {


            shayar.text = it.results.get(0).content
            author.text = it.results.get(0).author

        })
        btnNext.setOnClickListener{

            mainViewModel.shayari.observe(this, Observer {


                shayar.text = it.results.get(count).content
                author.text = it.results.get(count).author
                if(count < it.results.size-1 ){
                  count++
                }
                else {
                   count = 0
                }

            })
        }
        }
    }




