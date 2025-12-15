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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
// ...
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun MessageCard(msg: Message) {
//    // Add padding around our message
//    Row(modifier = Modifier.padding(all = 8.dp)) {
//        Image(
//            painter = painterResource(R.drawable.ic_launcher_background),
//            contentDescription = "Contact profile picture",
//            modifier = Modifier
//                // Set image size to 40 dp
//                .size(40.dp)
//                // Clip image to be shaped as a circle
//                .clip(CircleShape)
//        )
//
//        // Add a horizontal space between the image and the column
//        Spacer(modifier = Modifier.width(8.dp))
//
//        Column {
//            Text(text = msg.author)
//            // Add a vertical space between the author and message texts
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(text = msg.body)
//        }
//    }
//}
//Alert dialogue which is used to add a popup message in the screen which can give an  alert and blocks the screen till the user responds usually asks confirmation ,warning or info
//AlertDialogue.Builder(this)
//        .setTitle("confirm Action")
//        .setMessage("are you sure you want to delete")
//        .setCancelable(false)
//        .setPositiveButton("Yes"){_,_->
//
//
//        }
//.setNegativeButton("No"){ dialog,_->
//dialog.dismiss()
//}
//.show()


