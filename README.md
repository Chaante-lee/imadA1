https://github.com/VCONLINE/imad5112w-assignment-one-Chaante-lee - my repository link
youtube video link


report 
the purpose of my app is to help my friend hera decide what to eat at different times in a day. the language i used is kotlin. the app gives uggestions based on the time of the day.
i Added a TextBox where the user can enter the time of day("Morning,", “Mid-morning”, "Afternoon,", “Mid-afternoon”, "Dinner,").The app then displays the meal suggestion based on the time
of the day. i Included a "Reset" button that clears the input and the meal suggestions from the TextBox. The app manages input errors, providing constructive feedback if the user enters
invalid information. I Created a new GitHub repository for your project. Commit and push my project files to the GitHub repository.


code
package vcmsa.ci.imadassignment1  // name of package

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity//author chatgpt

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
