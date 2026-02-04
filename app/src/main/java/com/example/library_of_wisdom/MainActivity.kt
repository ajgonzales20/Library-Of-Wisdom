package com.example.library_of_wisdom

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.library_of_wisdom.ui.theme.LibraryOfWisdomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LibraryOfWisdomTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CenteredButton(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CenteredButton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center // This centers content both vertically and horizontally
    ) {
        Button(onClick = {
            Log.d("LibraryLog", "Welcome to the library")
        }) {
            Text(text = "Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CenteredButtonPreview() {
    LibraryOfWisdomTheme {
        CenteredButton()
    }
}
