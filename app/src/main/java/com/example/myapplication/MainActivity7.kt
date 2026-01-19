package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)
        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)

        val contacts = listOf(
            Contact("Aju", "9876543210"),
            Contact("Alex", "9123456789"),
            Contact("Rahul", "9988776655"),
            Contact("Sneha", "9012345678")
        )

        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=ContactAdapter(contacts)
    }
}