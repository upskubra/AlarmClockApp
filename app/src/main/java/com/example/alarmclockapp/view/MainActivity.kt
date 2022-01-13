
package com.example.alarmclockapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alarmclockapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        add_icon.setOnClickListener{
            print("hllo")
            val intent = Intent(this, SetAlarmActivity::class.java)
            startActivity(intent)
        }

    }
}