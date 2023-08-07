package com.example.jetpackcomposertutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MessageCard("Android 2023!!")
        }
    }
}

@Composable
fun MessageCard(name: String){
    return Text(text = "Hello $name")
}

@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard("Android")
}