package ru.alexgladkov.jetpackcomposedemo.screens.daily.models

sealed class DailyEvent {
    object EnterScreen : DailyEvent()
    object ReloadScreen : DailyEvent()
    object PreviousDayClicked : DailyEvent()
    object NextDayClicked : DailyEvent()
    data class OnHabitClick(val habitId: Long, val newValue: Boolean) : DailyEvent()
}