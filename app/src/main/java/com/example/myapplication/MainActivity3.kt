package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//class MainActivity3 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent{
//            MessageCard("Android")
//        }
//    }
//}
//@Composable
//fun MessageCard(name:String){
//    Text(text = "Hello $name")
//}
//
//
//@Preview
//@Composable
//fun PreviewMessageCard(){
//    MessageCard("Android")
//}

//@Preview annotation lets to preview the composable functions with android studio without having to build and install the app to and android device
//here the @Composable is used to make the composable function and the annotation is used to make the function composed the function which is used as the compose which functions like which converts the code in to ui

// ...

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: com.example.myapplication.Message) {
    Text(text = msg.author)
    Text(text = msg.body)
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
    )
}
//lesson 2 layouts
