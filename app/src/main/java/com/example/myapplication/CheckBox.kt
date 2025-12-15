package com.example.myapplication

import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CheckBox : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔹 Connect XML checkboxes
        val meatCheckBox = findViewById<CheckBox>(R.id.checkbox_meat)
        val cheeseCheckBox = findViewById<CheckBox>(R.id.checkbox_cheese)

        // 🔹 Listener for Meat
        meatCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Meat selected", Toast.LENGTH_SHORT).show()
            }
        }

        // 🔹 Listener for Cheese
        cheeseCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Cheese selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
