package com.example.myapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Service Running", Toast.LENGTH_SHORT).show()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
