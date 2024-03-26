package com.example.myabiturient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DirectionOfPreparation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direction_of_preparation)

        val fitacs: Button = findViewById(R.id.fitacs)
        fitacs.setOnClickListener {
            val intent = Intent(this, FITaCS::class.java)
            startActivity(intent)
        }

    }
}