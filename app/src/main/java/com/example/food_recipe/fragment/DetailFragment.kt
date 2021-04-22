package com.example.food_recipe.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.food_recipe.Food
import com.example.food_recipe.R
import kotlinx.android.synthetic.main.activity_recipe_description.*


class DetailFragment : Fragment() {
   

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate fragment layout
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val food = arguments!!.getSerializable("food") as Food

        //attributing the appropriate food details to the fragment
        nameOfFood.text=food.foodTitle
        Ingredients.text=food.ingredients
        Recipe.text=food.description
        imageView.setImageResource(food.image!!)
    }
}