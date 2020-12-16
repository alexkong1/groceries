package com.alexkong.groceries

import com.google.gson.annotations.SerializedName

data class ManagerSpecial constructor(
    val imageUrl: String? = "https://raw.githubusercontent.com/Swiftly-Systems/code-exercise-android/master/images/L.png",
    val width: Int? = 16,
    val height: Int? = 8,
    @SerializedName("display_name")
    val displayName: String? = "Noodle Dish with Roasted Black Bean Sauce",
    @SerializedName("original_price")
    val originalPrice: String? = "2.00",
    val price: String? = "1.00"
) {
}