package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main8)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val todos = mutableListOf(
            Todo("Learn RecyclerView", false),
            Todo("Practice Kotlin", true),
            Todo("Build Android App", false)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TodoAdapter(todos)

    }
}