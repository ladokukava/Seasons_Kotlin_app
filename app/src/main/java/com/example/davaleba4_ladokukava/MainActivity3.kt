package com.example.davaleba4_ladokukava

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val receive1 = findViewById<TextView>(R.id.receive1)
        val third_page_editText = findViewById<TextView>(R.id.third_page_editText)
        val str =   intent.getStringExtra("second_page_editText")
        receive1.setText(str)

        val third_page_Enter = findViewById<EditText>(R.id.third_page_Enter)
        val third_page_add = findViewById<Button>(R.id.third_page_add)
        third_page_add.setOnClickListener {
            if (third_page_Enter.getText().toString() == "Summer"){
                intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("third_page_Enter", "Summer")
                startActivity(intent)
            }else{
                Toast.makeText(this, "Enter Summer!", Toast.LENGTH_SHORT).show()
            }
        }







    }
}