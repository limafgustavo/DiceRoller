package com.gustavolima.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gustavolima.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        startEmptyDice()

        binding.roolButton.setOnClickListener {
            roolDice()

        }


    }

    private fun startEmptyDice() {
        binding.imageDice1.setBackgroundResource(R.drawable.empty_dice)
        binding.imageDice2.setBackgroundResource(R.drawable.empty_dice)
    }

    private fun roolDice() {
        val randomInt1 = Random.nextInt(6)+1
        val randomInt2 = Random.nextInt(6)+1

        val diceImages = arrayOf(
        R.drawable.empty_dice,
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
        )

        binding.imageDice1.setBackgroundResource(diceImages[randomInt1])
        binding.imageDice2.setBackgroundResource(diceImages[randomInt2])

    }


}