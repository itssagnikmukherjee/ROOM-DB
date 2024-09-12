package com.example.room.data

import android.content.Context
import androidx.room.Room
import com.example.room.data.dataSource.ContactDatabase
import com.example.room.data.tables.Contact

object DataBaseInstance{
    lateinit var db : ContactDatabase
    fun getDB(context : Context) : ContactDatabase{
        return Room.databaseBuilder(context,ContactDatabase::class.java,"contacts").allowMainThreadQueries().build()
    }
}