package com.example.alarmclockapp.model


data class Alarm(
    var alarmId: Int,
    var hour: Int,
    var minute: Int,
    var title: String,
    var alarmOn: Boolean
) {

}