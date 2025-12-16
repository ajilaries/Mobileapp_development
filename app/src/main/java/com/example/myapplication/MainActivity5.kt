package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enables edge-to-edge layout (content can draw behind system bars)
        enableEdgeToEdge()

        // Connects the XML layout file to this Activity
        setContentView(R.layout.activity_main5)

        // Linking XML views with Kotlin code
        val etInput = findViewById<EditText>(R.id.etInput)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // Button click action
        btnSubmit.setOnClickListener {
            val inputText = etInput.text.toString().trim()

            if (inputText.isEmpty()) {
                Toast.makeText(this, "Please enter something", Toast.LENGTH_SHORT).show()
            } else {
                tvResult.text = "You entered: $inputText"
            }
        }
    }
}
// onCreate() → First method called when the activity starts
// Used to initialize UI components and logic

// setContentView() → Connects the XML layout file to the Activity

// AppCompatActivity → Provides backward compatibility
// (app works properly on older Android versions)

// enableEdgeToEdge() → Allows UI to extend behind status and navigation bars
