package com.example.habittracker.model

import java.util.Date

class DailyRecord(var date: Date, var records:ArrayList<Record>) {

    //region
    fun updateProgress(habitSlug:String,amount:Int){
        records.find { it.habit.slug == habitSlug }?.progress += amount
    }
    //endregion
}