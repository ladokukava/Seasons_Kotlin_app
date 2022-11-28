package com.example.davaleba4_ladokukava

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val receive2 = findViewById<TextView>(R.id.receive2)
        val str1 = intent.getStringExtra("third_page_Enter")
        receive2.setText(str1)

        val fourth_page_Enter = findViewById<EditText>(R.id.fourth_page_Enter)
        val fourth_page_add = findViewById<Button>(R.id.fourth_page_add)
        fourth_page_add.setOnClickListener {
            if (fourth_page_Enter.getText().toString() == "Autumn"){
                intent = Intent(this, MainActivity5::class.java)
                intent.putExtra("fourth_page_Enter", "Autumn")
                startActivity(intent)
            } else{
                Toast.makeText(this, "Enter Autumn!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}