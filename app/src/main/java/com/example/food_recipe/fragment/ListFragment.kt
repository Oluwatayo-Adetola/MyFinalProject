package com.example.food_recipe.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.food_recipe.DishMenu
import com.example.food_recipe.Food
import com.example.food_recipe.R
import com.example.food_recipe.activity.RecipeDescription
import com.example.food_recipe.activity.adapter
import com.example.food_recipe.activity.layoutManager
import kotlinx.android.synthetic.main.activity_main.*

class ListFragment : Fragment(), DishMenu.MyInterface {
    var foodlist=ArrayList<Food>() //create an array list to store food items

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addItemstoList()

    //making the recycle view appear vertically and pass layout data to adapter
        layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager=
            layoutManager
            adapter =
            DishMenu(activity!!, this, foodlist)
        recyclerView.adapter= adapter
    }

    //function to add to food information to the array list
    private fun addItemstoList() {
        foodlist.add(
            Food(
                "Fried Rice, Prep Time: 15 min, Cook Time -> 40 min",
                "450cal",
                "White rice (2 cups), 1 cup diced mixed vegetables, [seasonings: salt,pepper," +
                        "curry,thyme, stock cubes], vegetable oil, 1 diced onion",
                " " +
                        "Steps:\n 1). Wash the raw white rice until it turns clear and put it on a pot. Fill the pot with water until it's slightly above " +
                        "the rice level.\n 2). Add 1 tsp of curry and thyme, 1 stock cube, 2 tsp of vegetable oil, 1 tsp salt, pepper (to your satisfaction) to the washed rice and mix all together.\n" +
                        "3). Now let the rice boil until water dries up (cook on medium heat). While water boils, heat up 4 tbsp of vegetable oil in a pan.\n" +
                        "4). Once heated, add the diced vegetables and onion to the oil. Season the oil with 1 tsp curry, 1 stock cube, 1 tsp thyme, salt and pepper to your satisfaction. Stir and cook for 2-3 min.\n" +
                        "5). Add the boiled rice to the vegetable sauce and stir fry together for 5-6 min. Et Voila! Fried Rice is ready for you and me. ",
                R.drawable.fried_rice1
            )
        )

        foodlist.add(
            Food(
                "Chicken Stir Fry, Prep Time: 15 min, Cook Time -> 30 min", "500cal",
                "1 cup of diced Chicken, [seasoning - curry, thyme, salt, pepper, stock cubes], vegetable oil,[vegetables - carrot," +
                        "broccoli, green beans], long grain white rice (2 cups), 1 diced onion",
                "Steps:\n 1). Wash veggies and chop them into small bits.\n 2).Add 1 tsp of curry,thyme, salt, and pepper to the raw diced chicken, mix together and let marinate for 10 mins.\n " +
                        "3). Wash rice until it becomes clear and boil in a pot or rice cooker.\n 4). Heat up a pan with 3tbsp of oil. Once heated, add the marinated diced chicken to the oil and fry until chicken becomes brown.\n " +
                        "5). When done frying the chicken, take it out of pot and place it on a plate.\n 5). Add your diced veggies to the remaining oil in the pan, season with 1 stock cube and stir fry for 3 min.\n 8). Transfer chicken back to the pan and mix it with the veggies. Allow to cook for " +
                        "3 more minutes.\n Serve boiled rice and chicken stir fry on a plate. Bon Appetite",
                R.drawable.chicken_stirfry
            )
        )

        foodlist.add(
            Food(
                "Spaghetti, Prep Time: 10 min, Cook Time -> 40 min", "350cal",
                "2 tbsp 0f tomato paste,can of tomato sauce,[seasonings: salt,pepper," +
                        "curry,thyme, stock cubes], vegetable oil, 1 diced onion, 12 oz raw pasta",
                "Steps:\n 1). Break raw pasta into small bits and boil in a pot. The water used in boiling the pasta " +
                        "should be 3-4 cups. Adding salt at this stage is optional.\n 2). Occasionally separate pasta with a thong so it doesn't stick together. Once pasta boils, drain pasta in a seive and store in a container.\n 3).Heat up 5-7 tbsp of oil in a pan, then add" +
                        "your diced onions to it. Cook for 1-2 min.\n. 3). Add your can of tomato sauce to the pan and fry for 10 min. Stir occasionally so sauce doesn't burn. Cook on low-mid heat.\n " +
                        "4). Add 2 tbsp of tomato paste to the pan to give the sauce a rich" +
                        "red colour.\n 5). Season the tomato sauce with 2 stock cubes, pepper (to your liking), 1 tsp of curry,thyme, and salt. Mix together and let cook for another 15 min.\n HINT: you know the sauce is cooked when it starts showing little bubbles.\n " +
                        "6). After tomato sauce is cooked, add the boiled pasta to the sauce and mix together. Let it cook for 1-2 min.\n\n  \t\t\t Food is Ready!",
                R.drawable.spaghetti1
            )
        )

        foodlist.add(
            Food(
                "Alfredo Pasta, Prep Time: 15 min, Cook Time -> 40 min", "650cal",
                "80z pasta, 4 tbsp butter, 2 cloves of garlic, 1.5 cups milk, 1 cup heavy cream," +
                        "1/2 cup Parmesan cheese (shredded), salt, pepper, 2 tbsp parsley, preecooked shrimps ",
                "Steps:\n 1).Cook raw pasta according to package instructions.\n 2). Heat up butter in a pan and cook fpr 30-50 seconds.\n 3). " +
                        "Add milk and cream to the pan and stir continuously until the mixture boils.\n 4). Once mixture boils, add salt and pepper (to your satisfaction), as well as the parmesan cheese and mix. Add your precooked shrimps and let sauce cook for 15 min. \n  " +
                        "5). Once sauce is ready, add the boiled pasta and mix. Let it cook for another 5 min.\n\n            Dinner is served!",
                R.drawable.alfredo
            )
        )

        foodlist.add(
            Food(
                "Sweet Potato Fries, Eggs, Toast, Prep Time: 10 min, Cook Time -> 20 min", "350cal",
                " 2 eggs, salt, pepper, vegetable oil, 3 raw sweet potatoes,2 bread slices",
                "Steps:\n 1). Peel and dice 3 sweet potatoes.\n " +
                        "2). Heat a pan with 1 cup of vegetable oil and fry the sweet potatoes. Store excess oil from frying a container for future use. Alternative: You can air fry the potatoes if you'd prefer.\n 3). Extract two 2 tps from the oil used for frying the potatoes, and heat it in a separate pan." +
                        "3). When heated, fry your two eggs until they turn dark yellow/brown. Adding salt to the eggs are optional. 4)Toast two slides of bread on a toaster. Serve all on a plate\n Breakfast is ready to be eaten! ",
                R.drawable.sweetpotato_fries
            )
        )

        foodlist.add(
            Food(
                "Lasagna, Prep Time: 20 min, Cook Time -> 45 min", "400cal",
                "9 lasagna noodles, 1 tbsp olive oil, 1 pound ground beef, 1 diced onion, salt, pepper, 28 ounce can crushed tomatoes, 1 tbsp Italian seasoning," +
                        "15 ounce whole milk ricotta, 3.5 cups shredded mozarella, 1 egg, 1/4 grated parmesan",
                "Steps:\n 1).Lightly oil the baking pan and oven heat at 350 degrees F.\n " +
                        "2).Boil lasagna noodles with 4 cups of salted water.\n 3).Heat up olive oil in a large pan on medium heat. Add the ground beef, diced onions to the pan and saute for 3-5 min. Add the italian seasoning, salt, pepper, and continuously stir for another " +
                        "5 mins.\n 4). Mix the ricotta, 1/2 cup mozzarella and beaten egg in a bowl.\n 5). Spread 1 cup of the tomato paste on the baking tray. Add 3 lasagna noodles, 1/2 of the ricotta cheese mixture and 1 cup mozzarella cheese. Add another 3 layers on top of the toppings and repeat the process.\n " +
                        "6). Place lasagna in the oven and bake for 35-45 min. When baked, broil until brown.\n 7). Let it cool for 15 minutes.\n\n        Lasagna is ready! ",
                R.drawable.lasagna
            )
        )

        foodlist.add(
            Food(
                "Mashed Potatoes, Prep Time: 15 min, Cook Time -> 20 min", "650cal",
                " 1 cup milk, salt, pepper, 2 pounds baking potatoes, peeled and quartered, 2 tbsp butter",
                "" +
                        "Steps:\n 1). Boil 3 cups of salt water in a pot. Add potatoes to the boiled water and cook till soft (15 min). Drain when potatoe from salt water when it has finished boiling.\n " +
                        "2). Heat butter and milk on low heat on a pan. Blend boiled potato until smooth using a potato masher. Then add the blended potatoes to the milk mixture on the pan \n " +
                        "3. Season with salt and pepper to taste. Allow to cook for 5 min.\n\n   Food is ready!",
                R.drawable.mashed_potatoes
            )
        )

        foodlist.add(
            Food(
                "Rice and Chicken Curry, Prep Time: 15 min, Cook Time -> 30 mins",
                "450cal",
                "2 tbsp butter," +
                        "1 diced onion, 2 tbsp all purpose flour, salt, pepper, diced chocken breasts, 14.5 ounce of chicken broth, raw white rice",
                "Steps:\n 1). Wash your raw white rice and bring to a boil on a rice cooker.\n 2). Heat 1 tbsp butter on a large pan on medium heat. Once heated, add 3 tbsp diced onions to the pan and let it turn brown.\n " +
                        "3). Mix flour and seasoning on a bowl and coat the chicken with the mixture. Add the remaining butter to the pan with onions and fry the chicken until brown.\n " +
                        "4). Add the chicken broth to the pan and let it boil. You may add water if necessary.\n\n       Et Voila! ",
                R.drawable.rice_curry
            )
        )
    }

    //function to pass data from array list to the fragment
    override fun passData(food: Food) {

        // create variable to store the instance of the support fragment
        val manager = activity!!.supportFragmentManager

        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()

        //create feature to collect all food items
        val collection = Bundle()
        collection.putSerializable("food",food)

        //add bundle of food info to the fragment
        val fragmentData = DetailFragment()
        fragmentData .arguments=collection

        // Replace the fragment on container during fragment transaction
        transaction.replace(R.id.fragment_container,fragmentData )
        transaction.commit()
    }


}