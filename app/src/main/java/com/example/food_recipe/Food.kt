package com.example.food_recipe

import java.io.Serializable

//create a class and constructor  to store all the necessary food details
class Food : Serializable{
    var foodTitle: String? = null
    var foodCalories: String? = null
    var ingredients: String? = null
    var description: String? = null
    var image: Int? = null

    constructor(foodTitle: String, foodCalories: String,ingredients: String, description: String, image: Int) {
        this.foodTitle = foodTitle
        this.foodCalories = foodCalories
        this.ingredients = ingredients
        this.description = description
        this.image = image
    }
}
