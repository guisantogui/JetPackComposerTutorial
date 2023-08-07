package com.example.jetpackcomposertutorial

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposertutorial.ui.theme.JetPackComposerTutorialTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            JetPackComposerTutorialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(Message("Android 2023", "BUSQUEM CONHECIMENTO"))
                }
            }
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(message: Message){
    Row {

        Image ( painter = painterResource(id = R.drawable.me),
                contentDescription = "User profile picture",

                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)

        )
        Spacer (modifier = Modifier.width(10.dp))
        Column {
            Text(   text = "Hello ${message.author}",
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleMedium
                )
            Text(   text = message.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.bodySmall

            )
        }
    }
}

@Preview(name = "Light Mode")
@Preview(   uiMode = Configuration.UI_MODE_NIGHT_YES,
            showBackground = true,
            name = "Dark Mode"
        )
@Composable
fun PreviewMessageCard(){
    JetPackComposerTutorialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            MessageCard(Message("Android 2023", "BUSQUEM CONHECIMENTO"))
        }
    }
}