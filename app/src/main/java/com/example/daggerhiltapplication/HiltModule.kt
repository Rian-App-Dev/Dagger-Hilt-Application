package com.example.daggerhiltapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    @Provides
    fun provideCoffee(milk: Milk): Coffee{
        return Coffee(milk)
    }
    @Provides
    fun provideMilk(milkQuantity: SugarImpl): Milk{
        return Milk(milkQuantity)
    }
    @Provides
    fun milkQuantity(): MilkQuantity{
        return MilkQuantity()
    }
    @Provides
    fun sugar():SugarImpl{
        return SugarImpl()
    }
}