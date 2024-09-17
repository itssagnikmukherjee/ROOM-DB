package com.example.room

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.room.data.DataBaseInstance
import com.example.room.presentation.navigation.AppNavigation
import com.example.room.ui.theme.ROOMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ROOMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val dbObject = DataBaseInstance.getDB(this).dao()
                    Box(modifier = Modifier.padding(innerPadding)){
                       AppNavigation(dbObject)
                    }
                }
            }
        }
    }
}

