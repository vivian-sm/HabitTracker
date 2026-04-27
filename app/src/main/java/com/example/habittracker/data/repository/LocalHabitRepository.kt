package com.example.habittracker.repository

import android.content.Context
import com.example.habittracker.data.repository.HabitRepository
import com.example.habittracker.model.Habit
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File


/* NOTES:
 * A Local File manager,
 * using `File` library, for `habits` CRUD using `JSON` inside the `DailyRecord`
 */
class LocalHabitRepository(private val context: Context) : HabitRepository {

    private val fileName =  "dailyrecords.json"
    private val file get() = File(context.filesDir, fileName)

    override fun saveHabits(habits: ArrayList<Habit>) {
        file.writeText(Json.encodeToString(habits))
    }

    override fun loadHabits(): ArrayList<Habit> {
        if (!file.exists()) return emptyList()
        return Json.decodeFromString(file.readText())
    }

    override fun addHabit(habit: Habit) {
        saveHabits(loadHabits() + habit)
    }

    override fun deleteHabit(habit: Habit) {
        saveHabits(loadHabits() - habit)
    }

    override fun updateHabit(oldSlug: String, updated: Habit) {
        val habits = loadHabits().map { existing ->
            if (existing.slug == oldSlug) updated else existing
        }
        saveHabits(habits)
    }
}