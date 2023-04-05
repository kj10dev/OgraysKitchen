package com.example.ograyskitchen.database

import android.content.Context
import android.provider.Settings.Global
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.instance
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@Database(entities = [FoodItem::class], version = 1, exportSchema = false)
abstract class FoodItemDatabase: RoomDatabase() {
    abstract fun foodItemDao(): FoodItemDao

    companion object{
        @Volatile
        private var instance: FoodItemDatabase? = null

        fun getInstance(context: Context): FoodItemDatabase {
            return instance ?: synchronized(this) {
               val database = Room.databaseBuilder(
                        context.applicationContext,
                        FoodItemDatabase::class.java,
                        "foodItem_database"

                    )

                   .addCallback(object : Callback(){
                            override fun onCreate(db: SupportSQLiteDatabase) {
                                super.onCreate(db)
                                //Add entities to the database upon initialization
                                GlobalScope.launch(Dispatchers.IO) {
                                    val foodItemDao = instance!!.foodItemDao()
                                    foodItemDao.insertAll(
                                        listOf(
                                            FoodItem(foodItemName = "Fufu", foodItemPrice = 100.00, foodItemCategory = "Mains"),
                                            FoodItem(foodItemName = "Peanut Brittle", foodItemPrice = 15.0, foodItemCategory = "Desserts"),
                                            FoodItem(foodItemName = "Yams & Stew", foodItemPrice = 45.0, foodItemCategory = "Starters"),
                                            FoodItem(foodItemName = "Ice kenke", foodItemPrice = 29.0, foodItemCategory = "Desserts"),
                                            FoodItem(foodItemName = "Peanut buttor soup and rice balls", foodItemPrice = 45.0, foodItemCategory = "Specials"),
                                            FoodItem(foodItemName = "Chocolate & banana bread", foodItemPrice = 35.0, foodItemCategory = "Desserts"),
                                            FoodItem(foodItemName = "Homemade bread", foodItemPrice = 12.0, foodItemCategory = "Starters"),
                                            FoodItem(foodItemName = "Waakye", foodItemPrice = 25.0, foodItemCategory = "Mains"),
                                            FoodItem(foodItemName = "Jollof", foodItemPrice = 18.0, foodItemCategory = "Mains"),
                                            FoodItem(foodItemName = "Chin Chin", foodItemPrice = 17.0, foodItemCategory = "Starters")
                                            )
                                    )
                                }
                            }
                        })

                        .build()

                    instance = database
                return database
                }

            }
        }

}