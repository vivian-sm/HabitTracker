package com.example.habittracker.data.repository

import com.example.habittracker.model.DailyRecord
import com.example.habittracker.model.Record
import java.util.Date

interface DailyRecordRepository {
    fun saveDailyRecord(dailyRecord: DailyRecord)
    fun getDailyRecord(date:Date): DailyRecord?
    fun insertRecord(date: Date, record: Record)
    fun updateRecord(date: Date, habitSlug: String, amount: Int)
    fun deleteRecord(date: Date, habitSlug: String)
}