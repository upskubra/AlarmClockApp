
package com.example.alarmclockapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alarmclockapp.R
import com.example.alarmclockapp.adapter.AlarmRecyclerAdapter
import com.example.alarmclockapp.model.Alarm
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // example variable
        val alarm : Alarm
        alarm = Alarm(15, 20, 12, "dsakfaksfh", false)
        val alarm1 : Alarm
        alarm1 = Alarm(15, 20, 12, "dsakfaksfh", false)
        val alarm2 : Alarm
        alarm2 = Alarm(15, 20, 12, "dsakfaksfh", false)

        var alarmArrayList : ArrayList<Alarm> = ArrayList()
        alarmArrayList.add(alarm)
        alarmArrayList.add(alarm1)
        alarmArrayList.add(alarm2)



        add_icon.setOnClickListener{
            print("hllo")
            val intent = Intent(this, SetAlarmActivity::class.java)
            startActivity(intent)
        }

        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager



        val adapter = AlarmRecyclerAdapter(alarmArrayList)
        recyclerview.adapter =adapter

    }
}