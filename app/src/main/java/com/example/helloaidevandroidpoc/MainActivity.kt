package com.example.helloaidevandroidpoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

const val HELLO_WORLD_TEXT = "Hello world!"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HelloWorld()
        }
    }
}

@Composable
fun HelloWorld() {
    Text(text = HELLO_WORLD_TEXT)
}
