package com.example.room.data

import android.health.connect.datatypes.ExerciseRoute.Location
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts") // Entity Annotation
data class Contact(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID") var id: Int? = null, // Primary Key Annotation
    @ColumnInfo(name = "Name") var name: String,
    var location: String,
    var number: String,
    var email: Email
)

