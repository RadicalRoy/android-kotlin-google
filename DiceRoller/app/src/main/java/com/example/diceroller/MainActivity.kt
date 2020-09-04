package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var leftDiceImage: ImageView
    lateinit var rightDiceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leftDiceImage = findViewById(R.id.left_dice_image)
        rightDiceImage = findViewById(R.id.right_dice_image)


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener{countUp()}
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()


        leftDiceImage.setImageResource(getImageResource())
        rightDiceImage.setImageResource(getImageResource())
    }

    private fun countUp() {

    }

    private fun getImageResource(): Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}