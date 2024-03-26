package com.example.myabiturient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val informationAboutDirections: Button = findViewById(R.id. informationAboutDirections)
            informationAboutDirections.setOnClickListener {
                val intent = Intent(this, DirectionOfPreparation::class.java)
                startActivity(intent)
            }


    }
}