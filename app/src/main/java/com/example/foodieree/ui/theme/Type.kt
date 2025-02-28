package com.example.yourapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

val AppTypography = Typography(
    headlineLarge = TextStyle(
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    ),
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    )
)
