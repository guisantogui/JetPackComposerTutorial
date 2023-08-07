package com.example.jetpackcomposertutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MessageCard(Message("Android 2023", "BUSQUEM CONHECIMENTO"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(message: Message){
    Column {
        Text(text = "Hello ${message.author}")
        Text(text = message.body )
    }
}

@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(Message("Android 2023", "BUSQUEM CONHECIMENTO"))
}