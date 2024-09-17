package com.example.room.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.room.data.dao.ContactDao
import com.example.room.data.tables.Contact


@Composable
fun AddEditContactScreen(dbObject: ContactDao? = null, navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var phone by remember { mutableStateOf("") }
        Column {
            OutlinedTextField(value = name, onValueChange = {name=it})
            OutlinedTextField(value = email, onValueChange = {email=it})
            OutlinedTextField(value = phone, onValueChange = {phone=it})
            Button(onClick = {

                if (dbObject != null) {
                    dbObject.insertContact(
                        Contact(
                            name = name,
                            email = email,
                            location = "Delhi",
                            number = phone
                        )
                    )
                    navController.navigateUp()
                }
                Contact(name=name, email = email, location = "Delhi", number = phone)

            }) {
                Text(text = "Save Contact")
            }
        }
    }
}