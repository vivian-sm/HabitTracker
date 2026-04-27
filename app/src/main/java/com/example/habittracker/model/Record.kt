package com.example.habittracker.model


class Record(
    var habit: Habit,
    var progress: Int
) {
    //region Computed Field
    val progressPercentage: Int
        get() = (progress * 100) / habit.goal

    val isCompleted: Boolean
        get() = progress >= habit.goal
    //endregion
}