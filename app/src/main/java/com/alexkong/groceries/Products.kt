package com.alexkong.groceries

data class Products constructor(
    val canvasUnit: Int,
    val managerSpecials: MutableList<ManagerSpecial>
){
}