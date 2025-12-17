package com.example.myapplication

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AnotherExamplePractice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_another_example_practice)
        val checkBox = findViewById<CheckBox>(R.id.cbAgree)
        val switch = findViewById<Switch>(R.id.swNotify)
        val radioGroup = findViewById<RadioGroup>(R.id.rgTheme)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbLight -> Toast.makeText(this, "Light mode", Toast.LENGTH_SHORT).show()
                R.id.rbDark -> Toast.makeText(this, "Dark mode", Toast.LENGTH_SHORT).show()
            }
        }

    }
}