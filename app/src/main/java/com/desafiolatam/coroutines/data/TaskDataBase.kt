package com.desafiolatam.coroutines.data

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * NO MODIFICAR
 */

@Database(entities = [TaskEntity::class], version = 1)
abstract class TaskDataBase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}