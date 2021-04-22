package com.example.food_recipe

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Create recycle view  to have several food display options

class DishMenu(
    context: Context,
    listener: MyInterface,
    foodlist: ArrayList<Food>
)
    : RecyclerView.Adapter<DishMenu.ViewHolder>() {

    private var listener: MyInterface? = null
    private var context: Context? = null
    private var foodlist: ArrayList<Food>

    init {
        this.context = context
        this.listener = listener;
        this.foodlist=foodlist
    }

    //Create another class to initialize food data with the necessary layouts
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var foodName: TextView
        var foodCalories: TextView

        //initialize block
        init {
            this.image = itemView.findViewById(R.id.mainPhoto)
            this.foodName = itemView.findViewById(R.id.foodItemTitle)
            this.foodCalories = itemView.findViewById(R.id.foodCalories)
        }
    }

    //function to initialize xml file and data members used in the Recycler View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val ob = LayoutInflater.from(parent.context).inflate(R.layout.dish_options, parent, false)
        return ViewHolder(ob)
    }

    //nind all the class data members to the recycle view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = foodlist.get(position)
        holder.foodName.text = food.foodTitle
        holder.foodCalories.text = food.foodCalories
        holder.image.setImageResource(food.image!!)

        holder.image.setOnClickListener {
            listener!!.passData(food)
        }
    }

    //This function counts all the items in the RecycleView and runs them
    override fun getItemCount(): Int {
        return foodlist.size
    }

    interface MyInterface {
        fun passData(name: Food)
    }
}