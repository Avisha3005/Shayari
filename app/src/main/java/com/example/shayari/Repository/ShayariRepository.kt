package com.example.shayari.Repository

import android.graphics.pdf.PdfDocument
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shayari.api.ShayariService
import com.example.shayari.models.Shayari

class ShayariRepository (private val shayariService:ShayariService){
    private val shayariLiveData = MutableLiveData<Shayari>()

    val shayari : LiveData<Shayari>
        get() = shayariLiveData

    suspend fun getShayaris(page: Int)
    {
       val result = shayariService.getShayaris(page)
        if(result?.body() != null){
            shayariLiveData.postValue(result.body())
        }
    }
}