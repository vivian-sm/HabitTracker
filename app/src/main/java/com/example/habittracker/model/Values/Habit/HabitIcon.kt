package com.example.habittracker.model.values.habit

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons

enum class HabitIcon(val value: String) {
    //region Health & Fitness
    RUNNING("directions_run"),
    WALKING("directions_walk"),
    FITNESS_CENTER("fitness_center"),
    SELF_IMPROVEMENT("self_improvement"),
    BEDTIME("bedtime"),
    RESTAURANT("restaurant"),
    LOCAL_DRINK("local_drink"),
    //endregion

    //region Mind & Focus
    MENU_BOOK("menu_book"),
    EDIT_NOTE("edit_note"),
    LIGHTBULB("lightbulb"),
    PSYCHOLOGY("psychology"),
    //endregion

    //region Lifestyle
    BRUSH("brush"),
    MUSIC_NOTE("music_note"),
    NATURE("nature"),
    PETS("pets"),
    HOME("home"),
    //endregion

    //region Productivity
    TASK_ALT("task_alt"),
    SCHEDULE("schedule"),
    SAVINGS("savings"),
    WORK("work");
    //endregion

    //region Utility
    fun toImageVector(): ImageVector {
        return when (this) {
            HabitIcon.RUNNING         -> Icons.Default.DirectionsRun
            HabitIcon.WALKING         -> Icons.Default.DirectionsWalk
            HabitIcon.FITNESS_CENTER  -> Icons.Default.FitnessCenter
            HabitIcon.BEDTIME         -> Icons.Default.Bedtime
            HabitIcon.RESTAURANT      -> Icons.Default.Restaurant
            HabitIcon.LOCAL_DRINK     -> Icons.Default.LocalDrink
            HabitIcon.MENU_BOOK       -> Icons.Default.MenuBook
            HabitIcon.EDIT_NOTE       -> Icons.Default.EditNote
            HabitIcon.LIGHTBULB       -> Icons.Default.Lightbulb
            HabitIcon.PSYCHOLOGY      -> Icons.Default.Psychology
            HabitIcon.BRUSH           -> Icons.Default.Brush
            HabitIcon.MUSIC_NOTE      -> Icons.Default.MusicNote
            HabitIcon.NATURE          -> Icons.Default.Nature
            HabitIcon.PETS            -> Icons.Default.Pets
            HabitIcon.HOME            -> Icons.Default.Home
            HabitIcon.TASK_ALT        -> Icons.Default.TaskAlt
            HabitIcon.SCHEDULE        -> Icons.Default.Schedule
            HabitIcon.SAVINGS         -> Icons.Default.Savings
            HabitIcon.WORK            -> Icons.Default.Work
            HabitIcon.SELF_IMPROVEMENT -> Icons.Default.SelfImprovement
        }
    }
    //endregion
}