package com.example.room.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.room.data.dao.ContactDao
import com.example.room.presentation.screens.AddEditContactScreen
import com.example.room.presentation.screens.MainScreen

@Composable
fun AppNavigation(dbObject: ContactDao) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = ContactScreen){

            composable<ContactScreen> {
               MainScreen(dbObject,navController)
            }

            composable<SaveEditScreen> { 
                AddEditContactScreen(dbObject, navController)
            }
    }
}