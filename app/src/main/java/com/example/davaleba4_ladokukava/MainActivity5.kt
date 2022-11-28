package com.example.davaleba4_ladokukava

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val receive3 = findViewById<TextView>(R.id.receive3)
        val str3 = intent.getStringExtra("fourth_page_Enter")
        receive3.setText(str3)
    }
}