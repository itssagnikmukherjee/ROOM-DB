package com.example.room.presentation.navigation

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = ContactScreen){

            composable<ContactScreen> {
                Text(text = "Main Screen", Modifier.clickable { navController.navigate(SaveEditScreen) })
            }

            composable<SaveEditScreen> { 
                Text(text = "Save Edit Screen")
            }
    }
}