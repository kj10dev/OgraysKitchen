package com.example.ograyskitchen.database;

import java.lang.System;

@androidx.room.Entity(tableName = "foodItem_table")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/example/ograyskitchen/database/FoodItem;", "", "foodItemId", "", "foodItemName", "", "foodItemPrice", "", "foodItemCategory", "(JLjava/lang/String;DLjava/lang/String;)V", "getFoodItemCategory", "()Ljava/lang/String;", "setFoodItemCategory", "(Ljava/lang/String;)V", "getFoodItemId", "()J", "setFoodItemId", "(J)V", "getFoodItemName", "setFoodItemName", "getFoodItemPrice", "()D", "setFoodItemPrice", "(D)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class FoodItem {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long foodItemId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "foodItem_name")
    private java.lang.String foodItemName;
    @androidx.room.ColumnInfo(name = "foodItem_price")
    private double foodItemPrice;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "foodItem_category")
    private java.lang.String foodItemCategory;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ograyskitchen.database.FoodItem copy(long foodItemId, @org.jetbrains.annotations.NotNull()
    java.lang.String foodItemName, double foodItemPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String foodItemCategory) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FoodItem() {
        super();
    }
    
    public FoodItem(long foodItemId, @org.jetbrains.annotations.NotNull()
    java.lang.String foodItemName, double foodItemPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String foodItemCategory) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getFoodItemId() {
        return 0L;
    }
    
    public final void setFoodItemId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFoodItemName() {
        return null;
    }
    
    public final void setFoodItemName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getFoodItemPrice() {
        return 0.0;
    }
    
    public final void setFoodItemPrice(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFoodItemCategory() {
        return null;
    }
    
    public final void setFoodItemCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}