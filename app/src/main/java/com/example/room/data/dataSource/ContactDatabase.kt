package com.example.room.data.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.room.data.dao.ContactDao
import com.example.room.data.tables.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun dao() : ContactDao
}