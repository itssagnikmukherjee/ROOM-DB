package com.example.room.presentation.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.room.data.dao.ContactDao

@Composable
fun MainScreen(dbObject: ContactDao, navController: NavHostController) {
        Scaffold {innerPadding->
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(innerPadding)
            ){
                items(dbObject.getAllContacts().reversed()){
                    Card(modifier = Modifier.fillMaxWidth().padding(10.dp).height(70.dp)){
                        Text(text = it.name)
                        Text(text = it.number)
                        Text(text = it.email)
                    }
                }
            }
        }
}