
https://github.com/Chaante-lee/imadA1 my repository link personal

youtube video link


report 

the purpose of my app is to help my friend hera decide what to eat at different times in a day. the language i used is kotlin. the app gives uggestions based on the time of the day.
i Added a TextBox where the user can enter the time of day("Morning,", “Mid-morning”, "Afternoon,", “Mid-afternoon”, "Dinner,").The app then displays the meal suggestion based on the time
of the day. i Included a "Reset" button that clears the input and the meal suggestions from the TextBox. The app manages input errors, providing constructive feedback if the user enters
invalid information. I Created a new GitHub repository for your project. Commit and push my project files to the GitHub repository.


code

activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:gravity="center_horizontal">

    <EditText
        android:id="@+id/timeInput"
        android:layout_width="262dp"
        android:layout_height="80dp"
        android:autofillHints="username"
        android:hint=" Enter time of day"
        android:importantForAutofill="yes"
        android:inputType="text"
        android:textColor="#000000"
        android:textColorHint="#888888" />

    <Button
        android:id="@+id/suggestButton"
        android:layout_width="wrap_content"
        android:layout_height="67dp"
        android:layout_marginTop="16dp"
        android:text="Get Meal Suggestion" />

    <TextView
        android:id="@+id/mealSuggestion"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=""
        android:textSize="18sp"
        android:textColor="#000000"
        android:layout_marginTop="24dp"/>

    <Button
        android:id="@+id/resetButton"
        android:layout_width="wrap_content"
        android:layout_height="74dp"
        android:layout_marginTop="16dp"
        android:text="Reset" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="143dp"
        app:srcCompat="@drawable/food" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="206dp"
        android:layout_height="188dp"
        app:srcCompat="@drawable/cake" />
</LinearLayout>

MainActivity.kt
package vcmsa.ci.imadassignment1  // name of package

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity//author z bulbulia

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // this links the layout author chaante lee pillay
     //here i declared the variables
        //author chaante lee pillay
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val mealSuggestion = findViewById<TextView>(R.id.mealSuggestion)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
//this button will show meal suggestions when a user types in any of the following times or parts of the day
//author chaante lee pillay
        suggestButton.setOnClickListener {
            val input = timeInput.text.toString().trim().lowercase()
            val suggestion = when (input) {
                "morning" -> "Breakfast: pancakes,Eggs"
                "mid-morning" -> "Snack: Fruit"
                "afternoon" -> "Lunch: Sandwich"
                "mid-afternoon" -> "Snack: tea and Cake"
                "dinner" -> "Dinner: Pasta"
                "after dinner" -> "Dessert: chocolate or Ice cream"
                else -> null
            }
            mealSuggestion.text = suggestion ?: "Invalid input. Try: Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, After dinner."
        }
//this will reset the text view and the edit text box
 //author chaante lee pillay
        resetButton.setOnClickListener {
            timeInput.text.clear()
            mealSuggestion.text = ""
        }
    }//author Chaante lee pillay 
    <img width="510" height="639" alt="Screenshot 2025-08-29 185042" src="https://github.com/user-attachments/assets/4097bd5c-30d0-4ef7-98a4-ff9439c67722" />
    
<img width="487" height="633" alt="Screenshot 2025-08-29 185121" src="https://github.com/user-attachments/assets/3977fdc1-8f6f-46d8-a335-fc12<img width="429" height="628" alt="Screenshot 2025-08-29 185006" src="https://github.com/user-attachments/assets/30b7c1ad-953c-48e6-9f9e-f0d09dedf591" />
d70465f2" />

    


    
