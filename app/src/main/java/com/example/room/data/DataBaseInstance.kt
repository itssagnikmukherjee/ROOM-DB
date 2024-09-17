package com.example.room.data

import android.content.Context
import androidx.room.Room
import com.example.room.data.dataSource.ContactDatabase
import com.example.room.data.tables.Contact

object DataBaseInstance{
    var db : ContactDatabase? = null
    fun getDB(context : Context) : ContactDatabase{
        if (db==null){
            return Room.databaseBuilder(context,ContactDatabase::class.java,"contacts").allowMainThreadQueries().build()
        }
        return db!!
    }
}