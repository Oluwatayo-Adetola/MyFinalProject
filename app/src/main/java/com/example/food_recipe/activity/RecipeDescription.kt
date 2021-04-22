package com.example.food_recipe.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.food_recipe.Food
import com.example.food_recipe.R
import kotlinx.android.synthetic.main.activity_recipe_description.*


class RecipeDescription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_description)

        val food = intent.getSerializableExtra("food") as Food

        nameOfFood.text=food.foodTitle
        Ingredients.text=food.ingredients
        Recipe.text=food.description
        imageView.setImageResource(food.image!!)
    }
}