package com.example.habittracker.data.repository

import com.example.habittracker.model.DailyRecord
import java.util.Date

interface DailyRecordRepository {
    fun saveDailyRecord(dailyRecord: DailyRecord)
    fun getDailyRecord(date:Date): DailyRecord?
    fun deleteDailyRecord(date: Date)
}