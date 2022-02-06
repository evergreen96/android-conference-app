package com.example.data.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [LikeEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "like_database"
    }

    abstract fun userDao(): LikeDao
}