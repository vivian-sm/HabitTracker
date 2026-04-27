package com.example.habittracker.model

import android.text.TextUtils.isEmpty
import com.example.habittracker.model.Values.habit.HabitIcon

class Habit(
    name: String, description: String, goal: Int, unit: String, icon: HabitIcon
) {
    //region Declaration
    var name: String = name
        set(value) {
            if (value.length > 50) {
                throw IllegalArgumentException(
                    "Habit's name is too long, maximum is 50 characters."
                )
            }
            field = value
        }

    var description: String = description
        set(value) {
            if (value.length > 255) {
                throw IllegalArgumentException(
                    "Habit's description is too long, maximum is 255 characters."
                )
            }
            field = value
        }

    var goal: Int = goal
        set(value) {
            if (value <= 0) {
                throw IllegalArgumentException(
                    "Habit's Goal cannot be zero or negative."
                )
            }
            field = value
        }

    var unit: String = unit
        set(value) {
            if (isEmpty(value)) {
                throw IllegalArgumentException(
                    "Unit cannot be empty."
                )
            }
            if (value.length > 50) {
                throw IllegalArgumentException(
                    "Unit is too long, maximum is 50 characters."
                )
            }
            field = value
        }

    var icon: HabitIcon = icon

    //region Computed Field
    val slug: String
        get() = name.lowercase().replace(" ", "_")
    //endregion
    //endregion

    //region Init
    init {
        this.name = name
        this.description = description
        this.goal = goal
        this.unit = unit
        this.icon = icon
    }
    //endregion

    //region Utility

    //endregion
}