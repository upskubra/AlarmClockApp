package com.example.alarmclockapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity

data class Alarm(

    var hour: Int,
    var minute: Int,
    var title: String,
    var alarmOn: Boolean
) {
    @PrimaryKey(autoGenerate = true)
    var alarmId: Int = 0

}