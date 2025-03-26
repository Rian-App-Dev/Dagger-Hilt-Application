package com.example.daggerhiltapplication.mvvm
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val repo: Repo): ViewModel() {
    fun makeCoffeeRun(){
        repo.makeCoffee()
    }
}