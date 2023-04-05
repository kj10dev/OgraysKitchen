package com.example.ograyskitchen.database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras

class FoodItemViewModelFactory(private val dao: FoodItemDao)
    : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(FoodItemViewModel::class.java)){
            return FoodItemViewModel(dao) as T
        }
            throw IllegalAccessException("Unknown ViewModel")
    }

}