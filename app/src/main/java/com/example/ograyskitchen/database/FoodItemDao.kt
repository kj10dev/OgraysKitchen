package com.example.ograyskitchen.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FoodItemDao {
    @Query("SELECT * FROM foodItem_table")
    fun getAll(): LiveData<List<FoodItem>>

    @Insert
    suspend fun insert(foodItem: FoodItem)

    @Insert
    fun insertAll(foodItemList: List<FoodItem>)

    @Delete
    suspend fun delete(foodItem: FoodItem)

    @Update
    suspend fun update(foodItem: FoodItem)

    // Select * from table where category = starters/mains/dessert
    @Query("SELECT * FROM foodItem_table WHERE foodItem_category = :category")
    fun getAllCategory(category: String) : LiveData<List<FoodItem>>

}