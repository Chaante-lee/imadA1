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
    }//author Chaante lee pillay and chatgpt, chatgpt doesnt share url so i put their answer in my readme file
}
