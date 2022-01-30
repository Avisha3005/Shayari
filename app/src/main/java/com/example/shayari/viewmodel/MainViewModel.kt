package com.example.shayari.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shayari.Repository.ShayariRepository
import com.example.shayari.models.Shayari
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ShayariRepository): ViewModel() {
    init {
        viewModelScope.launch(Dispatchers.IO)
        {
            repository.getShayaris(1)
        }

    }
    val  shayari : LiveData<Shayari>
    get() = repository.shayari
}