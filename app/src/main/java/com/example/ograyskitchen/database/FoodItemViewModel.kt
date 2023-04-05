package com.example.ograyskitchen.database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.Transformations
import kotlinx.coroutines.launch

class FoodItemViewModel(val dao: FoodItemDao): ViewModel() {
    var newFoodItemName = ""
    var newFoodItemPrice = ""
    var newFoodItemCategory = ""

    private val foodItems = dao.getAll()
    val foodItemsString = Transformations.map(foodItems){
        foodItems -> formatFoodItems(foodItems)
    }

    private val mainItems = dao.getAllCategory("Mains")
    val mainItemsString = Transformations.map(mainItems){
        mainItems -> formatFoodItems(mainItems)
    }

    private val dessertsItems = dao.getAllCategory("Desserts")
    val dessertsString = Transformations.map(dessertsItems){
        dessertsItems -> formatFoodItems(dessertsItems)
    }

    fun formatFoodItems(foodItems: List<FoodItem>): String {
        return foodItems.fold(" ") {
            str, foodItem -> str + '\n' + formatFoodItem(foodItem)
        }

    }

    fun formatFoodItem(foodItem: FoodItem): String {
        var str = "Item Name: ${foodItem.foodItemName}"
        str += "Item price: ${foodItem.foodItemPrice}"
        str += "Item category: ${foodItem.foodItemCategory}"
        return str
    }

    fun addFoodItem() {
        viewModelScope.launch {
            val foodItem = FoodItem()
            foodItem.foodItemName = newFoodItemName
            foodItem.foodItemPrice = newFoodItemPrice.toDouble()
            foodItem.foodItemCategory = newFoodItemCategory
            dao.insert(foodItem)
        }
    }
}