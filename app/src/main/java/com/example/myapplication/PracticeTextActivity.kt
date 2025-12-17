package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.text.input.EditCommand
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticeTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practice_text)
        val etName=findViewById<EditText>(R.id.etName)
        val btnSubmit=findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val name=etName.text.toString()
            Toast.makeText(this, "Hello $name", Toast.LENGTH_SHORT).show()
        }
    }
}