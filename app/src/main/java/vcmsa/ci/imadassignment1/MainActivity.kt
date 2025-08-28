package vcmsa.ci.imadassignment1  // name of package

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // this links the layout

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val mealSuggestion = findViewById<TextView>(R.id.mealSuggestion)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

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

        resetButton.setOnClickListener {
            timeInput.text.clear()
            mealSuggestion.text = ""
        }
    }//author chatgpt
}
