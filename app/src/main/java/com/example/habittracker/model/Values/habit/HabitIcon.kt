package com.example.habittracker.model.Values.habit

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
//region Icon Library
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Brush
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Nature
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.TaskAlt
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Savings
import androidx.compose.material.icons.filled.Work
//endregion

/* NOTES:
 * IDK if this considered illegal for the project,
 * Because enum are taught in OOP Class
 * So I think it's OKAY?
 * It will make our life easier if it okay, HEHE
 * Thank you.
 */
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
            RUNNING          -> Icons.AutoMirrored.Filled.DirectionsRun
            WALKING          -> Icons.AutoMirrored.Filled.DirectionsWalk
            FITNESS_CENTER   -> Icons.Filled.FitnessCenter
            SELF_IMPROVEMENT -> Icons.Filled.SelfImprovement
            BEDTIME          -> Icons.Filled.Bedtime
            RESTAURANT       -> Icons.Filled.Restaurant
            LOCAL_DRINK      -> Icons.Filled.LocalDrink
            MENU_BOOK        -> Icons.Filled.MenuBook
            EDIT_NOTE        -> Icons.Filled.EditNote
            LIGHTBULB        -> Icons.Filled.Lightbulb
            PSYCHOLOGY       -> Icons.Filled.Psychology
            BRUSH            -> Icons.Filled.Brush
            MUSIC_NOTE       -> Icons.Filled.MusicNote
            NATURE           -> Icons.Filled.Nature
            PETS             -> Icons.Filled.Pets
            HOME             -> Icons.Filled.Home
            TASK_ALT         -> Icons.Filled.TaskAlt
            SCHEDULE         -> Icons.Filled.Schedule
            SAVINGS          -> Icons.Filled.Savings
            WORK             -> Icons.Filled.Work
        }
    }
    //endregion
}