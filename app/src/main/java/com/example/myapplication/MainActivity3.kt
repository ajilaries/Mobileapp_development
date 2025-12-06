package com.example.myapplication

import android.inputmethodservice.Keyboard
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
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

//class MainActivity3 : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MessageCard(Message("Android", "Jetpack Compose"))
//        }
//    }
//}

//data class Message(val author: String, val body: String)
//
//@Composable
//fun MessageCard(msg: com.example.myapplication.Message) {
//    Column {
//        Text(text = msg.author)
//        Text(text = msg.body)
//    }
//
//}
//
//@Preview
//@Composable
//fun PreviewMessageCard() {
//    MessageCard(
//        msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
//    )
//}
//lesson 2 layouts
//column functions lets to arrange elements vertically add column to the messagecard function
//        can use row to arrange items horizontally and box to stack element

//

//@Composable
//fun MessageCard(msg: Message){
//    Keyboard.Row(
//        Image(
//            painter = painterResource(R.drawable.ic_launcher_background),
//            contentDescription = "Image added for test"
//        )
//                Column (
//                Text(text = msg.author)
//                        Text (text = msg.body)
//                )
//    )
//}
