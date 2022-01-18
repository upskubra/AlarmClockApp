package com.example.alarmclockapp.service

import androidx.room.Dao
import com.example.alarmclockapp.model.Alarm

import androidx.room.Update

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query


@Dao
interface AlarmDao {

    @Insert
    suspend fun insertAll(vararg alarm: Alarm?): List<Long>

    @Query("DELETE FROM alarm")
    suspend fun deleteAllAlarms()

    @Query("SELECT * FROM Alarm")
     fun getAllAlarms(): LiveData<List<Alarm>>

    @Query("SELECT * FROM  Alarm WHERE alarmId")
    suspend fun getAlarm(alarmId: Int): Alarm

    @Update
    fun update(alarm: Alarm?)
}