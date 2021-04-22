package com.example.food_recipe.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food_recipe.R
import com.example.food_recipe.fragment.ListFragment

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        // Get the support fragment manager instance
        val manager = supportFragmentManager

        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()

        // Replace the fragment on container during fragment transaction
        transaction.replace(R.id.fragment_container,ListFragment())
        transaction.addToBackStack(null)
        transaction.commit()  //end fragment transaction
    }
}