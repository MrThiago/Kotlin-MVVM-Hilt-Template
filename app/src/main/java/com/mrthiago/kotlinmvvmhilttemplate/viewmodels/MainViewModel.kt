package com.mrthiago.kotlinmvvmhilttemplate.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mrthiago.kotlinmvvmhilttemplate.data.TempRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: TempRepository) : ViewModel() {
    // TODO: Implement the ViewModel

    val helloWorld: String
    init {
        Log.i("MainViewModel", "MainViewModel created!")

        helloWorld = "Hello World"
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("MainViewModel", "MainViewModel destroyed!")
    }
}