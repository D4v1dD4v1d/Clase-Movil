package com.example.cuadricula.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name:Int,
    val avaiableCourses: Int,
    @DrawableRes val imageRes: Int
)
