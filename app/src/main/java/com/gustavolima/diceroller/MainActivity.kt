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

     //   val roolButton: Button = binding.roolButton
       binding.roolButton.setOnClickListener {
           roolDice()

       }




    }

    private fun roolDice() {
    val randromInt = Random.nextInt(6) + 1
        binding.textView.text = randromInt.toString()
    }


}