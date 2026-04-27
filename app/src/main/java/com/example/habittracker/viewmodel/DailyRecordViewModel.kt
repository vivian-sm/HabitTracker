package com.example.habittracker.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

import java.time.LocalDate
import java.time.ZoneId
import java.util.Date

import com.example.habittracker.repository.LocalDailyRecordRepository
import com.example.habittracker.model.DailyRecord
import com.example.habittracker.model.Record

class HabitViewModel(application: Application) : AndroidViewModel(application) {
    //region Field
    private val repository = LocalDailyRecordRepository(application.applicationContext)
    private val dailyRecordLiveData: MutableLiveData<DailyRecord> = MutableLiveData()
    //endregion

    //region LiveData
    fun getInitialDailyRecord(date: Date) {
        val dailyRecord = repository.getDailyRecord(date)
        if (dailyRecord != null) {
            dailyRecordLiveData.value = dailyRecord
        } else {
            val newDailyRecord = DailyRecord(
                date, getCleanRecord()
            )
            repository.saveDailyRecord(newDailyRecord)
            dailyRecordLiveData.value = newDailyRecord
        }
    }

    fun newDailyRecord() {
        val newRecord = DailyRecord(
            getTodayDate(), getCleanRecord()
        )
        repository.saveDailyRecord(newRecord)
        dailyRecordLiveData.value = newRecord
    }

    fun updateDailyRecord(dailyRecord: DailyRecord) {
        repository.saveDailyRecord(dailyRecord)
        dailyRecordLiveData.value = dailyRecord
    }

    fun deleteDailyRecord(date: Date) {
        repository.deleteDailyRecord(date)/*
        LiveData must change to another date, so LiveData Value always exists.
        If None Create new Live Data
         */
    }
    //endregion

    //region Util

    fun getTodayDate(): Date {
        return Date.from(
            LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()
        )
    }

    fun getYesterdayDate(): Date {
        return Date.from(
            LocalDate.now().minusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant()
        )
    }

    //region Clean Daily Record
    private fun getYesterdayDailyRecord(): DailyRecord? {
        return repository.getDailyRecord(getYesterdayDate())
    }

    private fun getYesterdayRecords(): ArrayList<Record> {
        val yesterdayRecord = getYesterdayDailyRecord()
        if (yesterdayRecord == null) return ArrayList<Record>()
        return ArrayList(yesterdayRecord.records)
    }

    private fun getCleanRecord(): ArrayList<Record> {
        val previousRecords = getYesterdayRecords()
        val newRecords = ArrayList<Record>()
        for (habit in previousRecords) {
            newRecords.add(Record(habit.habit, 0))
        }
        return newRecords
    }
    //endregion
    //endregion

}