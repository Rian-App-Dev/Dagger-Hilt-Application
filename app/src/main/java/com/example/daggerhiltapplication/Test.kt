package com.example.daggerhiltapplication

import android.util.Log
import javax.inject.Inject

class Coffee(private val milk: Milk){
    fun makeCoffee(){
        Log.d("Coffee", "Coffee is ready")
        milk.makeMilk()
    }
}

class Milk @Inject constructor(sugar: SugarImpl){
    fun makeMilk(){Log.d("Coffee", "Milk is ready milk quantity is 6 liter")}
    init {
        sugar.addSugar()
        sugar.addExtraSugar()
    }
}

class MilkQuantity(){
    fun milkQuantity():Int {
        return 6
    }
}

interface Sugar{
    fun addSugar()
}
class SugarImpl: Sugar{
    override fun addSugar() {
        Log.d("Coffee", "Sugar is added")
    }
    fun addExtraSugar(){
        Log.d("Coffee", "Extra Sugar is added")

    }
}