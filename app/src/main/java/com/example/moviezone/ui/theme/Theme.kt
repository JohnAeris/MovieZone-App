package com.example.moviezone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.moviezone.R

private val DarkColorPalette = darkColors(
    background = space_cadet,
    surface = english_vermillion,
    primary = white,
    primaryVariant = old_lavender,
    secondary = burnished_brown,
    secondaryVariant = white,
    onSurface = black,

)

private val LightColorPalette = lightColors(
    background = white,
    surface = english_vermillion,
    primary = black,
    primaryVariant = white,
    secondary = burnished_brown,
    secondaryVariant = space_cadet,
    onSurface = white,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MovieZoneTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}