package com.chichi.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.chichi.todocompose.ui.theme.HighPriorityColor
import com.chichi.todocompose.ui.theme.LowPriorityColor
import com.chichi.todocompose.ui.theme.MediumPriorityColor
import com.chichi.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}