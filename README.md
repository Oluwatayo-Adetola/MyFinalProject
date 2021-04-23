# Oluwatayo Adetola Project Specifications

## TAYO FOOD APP
			Satisfy your taste buds with food recipes 🥘😋
 ![alt text](https://user-images.githubusercontent.com/13349374/115821792-13eb5d00-a421-11eb-851b-1f9244ccbceb.png)

				Let's Prepare some food shall we?
## Table of Contents 

1). Brief Overview of the Project 

    1.1  Discuss interface interactions of the application.

2). How to Run the Project 

    2.1  Installation instructions.
    2.2  Configuration instructions.
    2.3  Screenshots and Arrows to guide the user through the app interface. 

3). How the Project Was Created

	3.1 Clear illustration of the code using a MCV Diagram.
    3.2 Functionalities of certain aspects of the code for better understanding, e.g, fragments, 
    activities, recyclerview, etc.
    5.3 Discuss why fragments are important in the code’s functionality. Contrasting its uses with activity, 
    and things related to that scope.  

4). Acknowledgements and Credits

 
## 1). Brief Overview of the Project  

1.1)   Discuss Interface Interactions of the Application

Tayo Food App is an android application that makes its user’s food fantasies come into reality. The application contains a variety of dishes, along with their appropriate recipes. The food recipes are short, quick, easy, which all means it will give the best customer experience. As discussed in lectures, responsible UX design consists of simplistic ways to make its user engaged with the app. Users get engaged to applications through simple interface interactions like tapping, scrolling, swiping. Tayo Food App has interface interactions like tapping and scrolling, which will make the UI experience much smoother for the user. 

The user interface interactions of Tayo Food App were created through the use of layouts. Layouts are structures that help with the orientation of designs in an app. For this app, the main layout used for scrolling was the recycler view layout. The tapping feature was done with a click feature called "setOnClickListener()", which was put on an imageView in a constraint layout. My project is in Kotlin language and was written in Android Studio, so the code can be run on android emulators or on android devices.


## 2). How To Run The Project 

2.1)  Installation Instructions

To download my project, you would have to import the project from github to Android Studio. Users without Android Studio would have to download the IDE and set it up before importing the project. To download Android Studio, click the link of the website citation below and follow the instructions : 

    “Download Android Studio and SDK Tools &nbsp;: &nbsp; Android Developers.” Android Developers, developer.android.com/studio?gclid=Cj0KCQjwvYSEBhDjARIsAJMn0lihRWiTtYTY_eVs071arL7Dm9GHJ9Q8sRLLGUTMi3AowNpA_33WrAQaAhPrEALw_wcB&amp;gclsrc=aw.ds. 

When done downloading the IDE, learn how to import to Android studio using the website below:

    “How to Clone Android Project from GitHub in Android Studio?” GeeksforGeeks, 4 Nov. 2020, www.geeksforgeeks.org/how-to-clone-android-project-from-github-               in-android-studio/. 
    
2.2)  Configuration Instructions

Now that importing the code to android studio is complete, you would have to add some dependencies to your Android Studio to ensure the code works effectively.

Click on Click on "build.gradle (Module:)". 

 ![alt text](https://user-images.githubusercontent.com/13349374/115820165-ebae2f00-a41d-11eb-8617-fffc7912e657.png)

Go to dependency, then copy paste the text (given below) inside the dependency environment:

    apply plugin: "kotlin-android"
    apply plugin: "kotlin-android-extensions"
 ![alt text](https://user-images.githubusercontent.com/13349374/115820171-eea91f80-a41d-11eb-96fc-2e97aa8b5a9b.png)
After copying and pasting the text, click on "Sync now". 
 ![alt text](https://user-images.githubusercontent.com/13349374/115820175-f10b7980-a41d-11eb-8017-ab90f5d82ebf.png)
 Now, your android studio should be able to effectively run your code. 


2.3)  Screenshots and Arrows to guide the user through the app interface. 

 Run the app on your android studio. You should have the below image appear. Click on the image of any food you want to prepare.
 
![alt text](https://user-images.githubusercontent.com/13349374/115822035-7e040200-a421-11eb-9ae5-9e975a6a8636.png)
 
When you click the image, it would open a new tab that shows how to prepare the meal. 

![alt text](https://user-images.githubusercontent.com/13349374/115821828-206fb580-a421-11eb-9381-341184b35112.png)

## 3) How the Project Was Created

3.1)    Clear illustration of the code using a MCV Diagram.

My application would be explained using the Model Control View (MCV) Diagram. This diagram is very useful in understanding how to create software designs for user interfaces. It also serves as an organization tool to know exactly where and how classes, functions, and databases work together. The MCV diagram is broken into three parts: Model, Controller, and View. The Model feature is the environment which includes the data structures and database of the code. In my project, the model feature includes the classes used to store data members for our food, e.g food item, ingredients, recipes, images of food, etc. 

The View feature deals with what the user sees on the screen. This feature includes layouts, xml files. In my project, the view managed the designs of the app, like the orientation of the pictures and texts, the scrolling, clicking of the images. The Controller feature handles the instructions sent from the view and model feature. For example, clicking on an image (from the view feature) would notify the controller to update the UI so a new tab can open. In my project, the controller does just the same thing. For better understanding, a simple MCV Diagram would be pasted below to illustrate my explanations. 

![alt text](https://user-images.githubusercontent.com/13349374/115819958-85291100-a41d-11eb-80d3-52fce66204fd.png)

3.2)    Functionalities of certain aspects of the code for better understanding, e.g, fragments, activities, recyclerview, etc.

My project used both fragments and activities as their functionalities. This was mainly done to distinguish the difference between fragments and activities for learners. The code could function properly without fragments, but using fragments in android development is good practice. For this reason, I decided to incorporate both of them for educational purposes. As previously stated, the recycler view was the layout used for the scrolling feature. This made the code process a lot more efficient because I only created one image view and text view, then passed it to the adapter class. I didn’t have to create multiple xml files for each food recipe, which was very convenient.  

3.3)    Discuss why fragments are important in the code’s functionality. Contrasting its uses with activity, and things related to that scope. 

The great advantages of fragments are its flexibility and reusability. Fragments allow the user to open new tab interfaces without opening a new activity. This comes in handy when the user is trying to do multiple tasks simultaneously in one activity. Fragments work best with navigation of controllers, also with the  encapsulation of components in a reusable way. UI Fragments separates UIs of apps into building blocks, which is suitable for building tab interfaces, tack on animated side bars (Philips et al. 483). In my code, the fragment support manager and fragment transactions were used in managing my fragment layouts and organizing the fragment functions. Fragment managers are specifically involved in adding, removing, reformatting fragments in a given fragment list. For example, my program stored an array list of food items in a fragment, where the fragment and other fragments created were managed by the fragment manager. 

Using activities for the program was actually quite simpler than fragments as it was more straightforward. This makes sense because fragments work best with apps that are very complex. All I had to do for activities was to create the class and array food list, store it in the main kotlin file, then join the data from the recycle view to the main .kt file with the use of the adapter class. For this project specifically, there was no superior between fragments or activities, it was just to show how their functionalities differed. If this program was a lot more complex, then it would be safe to say that fragments would be a safer choice because it helps in keeping the code organized. 



## 4).    Acknowledgements and Credits 
Fragment Information:

- Phillips, Bill, et al. Android Programming - The Big Nerd Ranch Guide. 3rd Edition ed., Big Nerd Ranch, LLC, 2017. 


Food Images:

- “Pasta Alfredo.” Chef Papi Kitchens, www.chefpapikitchens.com/product/pasta-alfredo/48. 

- “Chicken Stir-Fry Recipes - Page 3.” BettyCrocker.com, www.bettycrocker.com/recipes/dishes/skillet-and-stir-fry-recipes/chicken-stir-fry?page=3. 

- Guiltytreats. “Food Is My Aesthetic.” 🍦, 22 Apr. 2020, guiltytreats.tumblr.com/post/616074721612677120. 

- “Sweet Potato Home Fries: Recipe: Sweet Potato Home Fries, Sweet Potato, Home Fries.” Pinterest, www.pinterest.ca/pin/296885800436508750/. 

- “Classic Spaghetti with Tomato Sauce Recipe.” The Mom 100, 14 Aug. 2020, themom100.com/recipe/spaghetti-with-tomato-sauce/. 

- “Recipe of Easy Chicken Recipes Indian.” Desing Monkey, 17 May 2020, desingmonkey.vercel.app/posts/easy-chicken-recipes-indian/. 

## Copyright Statements

Copyright @ Tayo Food App, 2021. All rights reserved.

All images and ideas that were not fully my own were cited in the above.
Modifiation of this document is permitted for educational purposed only. 
