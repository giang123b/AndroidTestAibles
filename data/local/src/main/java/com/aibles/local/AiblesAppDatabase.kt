package com.aibles.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.aibles.local.converter.Converters
import com.aibles.local.dao.UserDao
import com.aibles.model.User

@Database(entities = [User::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AiblesAppDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {

        fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, AiblesAppDatabase::class.java, "aibles.db")
                .build()
    }
}