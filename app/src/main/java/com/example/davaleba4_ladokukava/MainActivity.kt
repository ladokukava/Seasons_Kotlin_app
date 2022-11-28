package com.example.davaleba4_ladokukava

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first_page_button = findViewById<Button>(R.id.first_page_button)
        first_page_button.setOnClickListener {
            startActivity(Intent(this,  MainActivity2::class.java))
        }
    }
}