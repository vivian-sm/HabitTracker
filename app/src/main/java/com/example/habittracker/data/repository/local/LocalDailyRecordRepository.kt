package com.example.habittracker.repository

import android.content.Context
import com.example.habittracker.data.repository.DailyRecordRepository
import com.example.habittracker.model.DailyRecord
import com.example.habittracker.model.Record
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import java.util.Date

/* NOTES:
 * A Local File manager,
 * using `File` library, for `DailyRecord` CRUD using `JSON`
 * Each file represents one day: "{date.time}_dailyrecord.json"
 */
class LocalDailyRecordRepository(private val context: Context) : DailyRecordRepository {

    //region Utilities
    private val fileSuffix = "_dailyrecord.json"
    private fun getFile(date: Date) = File(context.filesDir, "${date.time}$fileSuffix")
    //endregion

    //region DailyRecord
    override fun saveDailyRecord(dailyRecord: DailyRecord) {
        getFile(dailyRecord.date).writeText(Json.encodeToString(dailyRecord))
    }

    override fun getDailyRecord(date: Date): DailyRecord? {
        val file = getFile(date)
        if (!file.exists()) return null
        return Json.decodeFromString(file.readText())
    }
    //endregion

    //region Record
    override fun insertRecord(date: Date, record: Record) {
        val dailyRecord = getDailyRecord(date) ?: DailyRecord(date, ArrayList())
        dailyRecord.records.add(record)
        saveDailyRecord(dailyRecord)
    }

    override fun deleteRecord(date: Date, habitSlug: String) {
        val dailyRecord = getDailyRecord(date) ?: DailyRecord(date, ArrayList())
        dailyRecord.records.removeIf { it.habit.slug == habitSlug }
        saveDailyRecord(dailyRecord)
    }

    override fun updateRecord(date: Date, habitSlug: String, amount: Int) {
        val dailyRecord = getDailyRecord(date) ?: return
        dailyRecord.updateProgress(habitSlug, amount)
        saveDailyRecord(dailyRecord)
    }
    //endregion
}