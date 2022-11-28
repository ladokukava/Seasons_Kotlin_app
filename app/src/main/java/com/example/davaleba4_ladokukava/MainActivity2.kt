package com.example.davaleba4_ladokukava

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var second_page_editText = findViewById<EditText>(R.id.second_page_editText)
        val second_page_add = findViewById<Button>(R.id.second_page_add)


        second_page_add.setOnClickListener() {
            if (second_page_editText.getText().toString() == "Spring") {
                intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("second_page_editText", "Spring")
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter Spring!", Toast.LENGTH_SHORT).show()
            }
        }


    }
}