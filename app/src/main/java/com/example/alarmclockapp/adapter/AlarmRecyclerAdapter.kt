package com.example.alarmclockapp.adapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.alarmclockapp.R
import com.example.alarmclockapp.model.Alarm;
import kotlinx.android.synthetic.main.item_alarm.view.*

import java.util.ArrayList;
import android.widget.Toast

import android.widget.CompoundButton


class AlarmRecyclerAdapter(val alarmList: ArrayList<Alarm>) :
    RecyclerView.Adapter<AlarmRecyclerAdapter.AlarmViewHolder>() {
    class AlarmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_alarm, parent, false)
        return AlarmViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlarmViewHolder, position: Int) {

        holder.itemView.item_alarm_name.text = alarmList[position].title
        holder.itemView.alarm_clock_hour.text = alarmList[position].hour.toString()
        holder.itemView.alarm_clock_minute.text = alarmList[position].minute.toString()

        holder.itemView.switch_.isChecked = alarmList[position].alarmOn

        holder.itemView.switch_.setOnCheckedChangeListener { compoundButton, checked ->
            val context = compoundButton.context
            if (checked) {
                Toast.makeText(context, "Checked", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(context, "Unchecked", Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun getItemCount(): Int {
        return alarmList.size

    }


}
