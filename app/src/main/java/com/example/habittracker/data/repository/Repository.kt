package com.example.habittracker.data.repository

import com.example.habittracker.model.Habit

class Repository{
    //region Account (Dummy Account for Project Requirements please don't change)
    val username = "student"
    val password = "123"
    //endregion

    //region HabitList
    var habitList = mutableListOf<Habit>()
    //endregion
}