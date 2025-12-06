package com.example.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MessageCard("Android")
        }
    }
}
@Composable
fun MessageCard(name:String){
    Text(text = "Hello $name")
}


@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard("Android")
}

//@Preview annotation lets to preview the composable functions with android studio without having to build and install the app to and android device
//here the @Composable is used to make the composable function and the annotation is used to make the function composed the function which is used as the compose which functions like which converts the code in to ui