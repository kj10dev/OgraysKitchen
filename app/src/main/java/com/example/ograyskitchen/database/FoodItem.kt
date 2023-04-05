package com.example.ograyskitchen.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "foodItem_table")
data class FoodItem (
    @PrimaryKey(autoGenerate = true)
    var foodItemId: Long = 0L,

    @ColumnInfo(name = "foodItem_name")
    var foodItemName: String = "",

    @ColumnInfo(name = "foodItem_price")
    var foodItemPrice: Double = 0.00,

    @ColumnInfo(name = "foodItem_category")
    var foodItemCategory: String = ""
)

