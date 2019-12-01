package com.devarthur.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.roll_button)
        rollbutton.text = "Lets rolll"

        rollbutton.setOnClickListener {
           rolldice()
        }


    }

    private fun rolldice() {
        val resultText : TextView = findViewById(R.id.result_text)
        val randomInt = Random.nextInt(6) + 1

        resultText.text = randomInt.toString()
    }
}
