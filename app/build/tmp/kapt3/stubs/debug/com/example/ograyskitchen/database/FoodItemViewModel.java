package com.example.ograyskitchen.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\nJ\u0014\u0010%\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/example/ograyskitchen/database/FoodItemViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/example/ograyskitchen/database/FoodItemDao;", "(Lcom/example/ograyskitchen/database/FoodItemDao;)V", "getDao", "()Lcom/example/ograyskitchen/database/FoodItemDao;", "dessertsItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/ograyskitchen/database/FoodItem;", "dessertsString", "", "kotlin.jvm.PlatformType", "getDessertsString", "()Landroidx/lifecycle/LiveData;", "foodItems", "foodItemsString", "getFoodItemsString", "mainItems", "mainItemsString", "getMainItemsString", "newFoodItemCategory", "getNewFoodItemCategory", "()Ljava/lang/String;", "setNewFoodItemCategory", "(Ljava/lang/String;)V", "newFoodItemName", "getNewFoodItemName", "setNewFoodItemName", "newFoodItemPrice", "getNewFoodItemPrice", "setNewFoodItemPrice", "addFoodItem", "", "formatFoodItem", "foodItem", "formatFoodItems", "app_debug"})
public final class FoodItemViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.ograyskitchen.database.FoodItemDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String newFoodItemName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String newFoodItemPrice = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String newFoodItemCategory = "";
    private final androidx.lifecycle.LiveData<java.util.List<com.example.ograyskitchen.database.FoodItem>> foodItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> foodItemsString = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.ograyskitchen.database.FoodItem>> mainItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> mainItemsString = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.ograyskitchen.database.FoodItem>> dessertsItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> dessertsString = null;
    
    public FoodItemViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ograyskitchen.database.FoodItemDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ograyskitchen.database.FoodItemDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewFoodItemName() {
        return null;
    }
    
    public final void setNewFoodItemName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewFoodItemPrice() {
        return null;
    }
    
    public final void setNewFoodItemPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewFoodItemCategory() {
        return null;
    }
    
    public final void setNewFoodItemCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFoodItemsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMainItemsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDessertsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatFoodItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ograyskitchen.database.FoodItem> foodItems) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatFoodItem(@org.jetbrains.annotations.NotNull()
    com.example.ograyskitchen.database.FoodItem foodItem) {
        return null;
    }
    
    public final void addFoodItem() {
    }
}