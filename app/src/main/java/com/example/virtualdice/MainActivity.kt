package com.example.virtualdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        //Objek dice dengan 6 sisi
        val dice = Dice(6)
        val diceRoll = dice.roll()

        //Meng-update layar dengan diceRoll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

//Fungsi untuk merandom numSides
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}