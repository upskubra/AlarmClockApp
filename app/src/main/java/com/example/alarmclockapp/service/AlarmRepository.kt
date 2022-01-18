package com.example.alarmclockapp.service

import androidx.lifecycle.LiveData
import com.example.alarmclockapp.model.Alarm

class AlarmRepository(private val alarmDao: AlarmDao) {

    // on below line we are creating a variable for our list
    // and we are getting all the alarm from our DAO class.
    val allAlarms: LiveData<List<Alarm>> = alarmDao.getAllAlarms()

    // on below line we are creating an insert method
    // for adding the alarm to our database.
    suspend fun insert(alarm: Alarm) {
        alarmDao.insertAll(alarm)
    }

    // on below line we are creating a delete method
    // for deleting our alarm from database.
    suspend fun delete(alarm: Alarm) {
        alarmDao.deleteAllAlarms()
    }

    // on below line we are creating a update method for
    // updating our alarm from database.
    suspend fun update(alarm: Alarm) {
        alarmDao.update(alarm)
    }
}