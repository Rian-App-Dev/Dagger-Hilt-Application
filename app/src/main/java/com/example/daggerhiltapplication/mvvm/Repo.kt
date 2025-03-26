package com.example.daggerhiltapplication.mvvm

import com.example.daggerhiltapplication.Coffee
import javax.inject.Inject

class Repo@Inject constructor(val coffee: Coffee) {
    fun makeCoffee(){
        coffee.makeCoffee()
    }
}