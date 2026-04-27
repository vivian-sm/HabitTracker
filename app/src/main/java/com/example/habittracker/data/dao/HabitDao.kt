package com.example.habittracker.data.dao

import com.example.habittracker.model.Habit

/*NOTES: This class is useless,
* because we planned to use GSON and Volley,
* We decide to use Local Storage using `File` Instead.
* We decide to leave this class, in case of future project
* If future project uses Local Storage that need SQLLite we will use this class.
*/
interface HabitDao {
    fun getAll(): ArrayList<Habit>
    fun get(slug: String): Habit
    fun insert(habit: Habit): Boolean
    fun update(old_slug:String,new_habit: Habit): Boolean
    fun delete(slug: String): Boolean
}