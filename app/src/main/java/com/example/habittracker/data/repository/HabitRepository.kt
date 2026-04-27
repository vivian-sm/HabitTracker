package com.example.habittracker.data.repository

import com.example.habittracker.model.Habit

/* NOTES:
 * I want to prepare for future project,
 * So, I prepared an interface for future projects, HEHE
 */
interface HabitRepository {
    fun loadHabits(): ArrayList<Habit>
    fun saveHabits(habits: ArrayList<Habit>)
    fun addHabit(habit: Habit)
    fun deleteHabit(habit: Habit)
    fun updateHabit(oldSlug: String, updated: Habit)
}
