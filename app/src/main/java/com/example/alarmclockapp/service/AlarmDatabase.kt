package com.example.alarmclockapp.service

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.alarmclockapp.model.Alarm
import androidx.room.Room


@Database(entities = arrayOf(Alarm::class), version = 1)
abstract class AlarmDatabase : RoomDatabase() {
    abstract fun alarmDao(): AlarmDao

    // singleton
    companion object {

        @Volatile
        private var instance: AlarmDatabase? = null

        private val lock = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(lock) {
            instance ?: createDatabase(context).also {
                instance = it
            }

        }


        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AlarmDatabase::class.java,
                "alarmDatabase"
            ).build()
    }

}





