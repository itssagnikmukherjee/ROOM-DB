package com.example.room.data

import android.health.connect.datatypes.ExerciseRoute.Location
import android.provider.ContactsContract.CommonDataKinds.Email

data class Contact(
    var name: String,
    var location: String,
    var number: String,
    var email: Email
)