package com.gthio.composecustomthememat3.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

// Primary Colors
val PrimaryMain = Color(0xFFFF2352)
val PrimarySurface = Color(0xFFFFD3DC)
val PrimaryBorder = Color(0xFFFFB6C5)
val PrimaryHover = Color(0xFFD51D44)
val PrimaryPressed = Color(0xFF801129)
val PrimaryFocus = Color(0xFFF3C4CE)

// Neutral Colors
val Neutral10 = Color(0xFFFFFFFF)
val Neutral20 = Color(0xFFF5F5F5)
val Neutral30 = Color(0xFFEDEDED)
val Neutral40 = Color(0xFFE0E0E0)
val Neutral50 = Color(0xFFC2C2C2)
val Neutral60 = Color(0xFF9E9E9E)
val Neutral70 = Color(0xFF757575)
val Neutral80 = Color(0xFF616161)
val Neutral90 = Color(0xFF404040)
val Neutral100 = Color(0xFF0A0A0A)

// Success Colors
val SuccessMain = Color(0xFF65C466)
val SuccessSurface = Color(0xFFE0F3F0)
val SuccessBorder = Color(0xFFCCEBCC)
val SuccessHover = Color(0xFF54A355)
val SuccessPressed = Color(0xFF326233)

// Error Colors
val ErrorMain = Color(0xFFED4330)
val ErrorSurface = Color(0xFFFBD9D6)
val ErrorBorder = Color(0xFFF9C0BA)
val ErrorHover = Color(0xFFC53828)
val ErrorPressed = Color(0xFF762118)

// Info Colors
val InfoMain = Color(0xFF3267E3)
val InfoSurface = Color(0xFFF0F3FF)
val InfoBorder = Color(0xFFB1C5F6)
val InfoHover = Color(0xFF114CD6)
val InfoPressed = Color(0xFF11317D)

// Danger Colors
val DangerMain = Color(0xFFED8D30)
val DangerSurface = Color(0xFFFBE8D6)
val DangerBorder = Color(0xFFF9D8BA)
val DangerHover = Color(0xFFC57428)
val DangerPressed = Color(0xFF764518)

@Immutable
data class LucyColors(
    val primaryMain: Color,
    val primarySurface: Color,
    val primaryBorder: Color,
    val primaryHover: Color,
    val primaryPressed: Color,
    val primaryFocus: Color,

    val neutral10: Color,
    val neutral20: Color,
    val neutral30: Color,
    val neutral40: Color,
    val neutral50: Color,
    val neutral60: Color,
    val neutral70: Color,
    val neutral80: Color,
    val neutral90: Color,
    val neutral100: Color,

    val successMain: Color,
    val successSurface: Color,
    val successBorder: Color,
    val successHover: Color,
    val successPressed: Color,

    val errorMain: Color,
    val errorSurface: Color,
    val errorBorder: Color,
    val errorHover: Color,
    val errorPressed: Color,

    val infoMain: Color,
    val infoSurface: Color,
    val infoBorder: Color,
    val infoHover: Color,
    val infoPressed: Color,

    val dangerMain: Color,
    val dangerSurface: Color,
    val dangerBorder: Color,
    val dangerHover: Color,
    val dangerPressed: Color,
)

val LocalLucyColors = staticCompositionLocalOf {
    LucyColors(
        primaryMain = Color.Unspecified,
        primarySurface = Color.Unspecified,
        primaryBorder = Color.Unspecified,
        primaryHover = Color.Unspecified,
        primaryPressed = Color.Unspecified,
        primaryFocus = Color.Unspecified,

        neutral10 = Color.Unspecified,
        neutral20 = Color.Unspecified,
        neutral30 = Color.Unspecified,
        neutral40 = Color.Unspecified,
        neutral50 = Color.Unspecified,
        neutral60 = Color.Unspecified,
        neutral70 = Color.Unspecified,
        neutral80 = Color.Unspecified,
        neutral90 = Color.Unspecified,
        neutral100 = Color.Unspecified,

        successMain = Color.Unspecified,
        successSurface = Color.Unspecified,
        successBorder = Color.Unspecified,
        successHover = Color.Unspecified,
        successPressed = Color.Unspecified,

        errorMain = Color.Unspecified,
        errorSurface = Color.Unspecified,
        errorBorder = Color.Unspecified,
        errorHover = Color.Unspecified,
        errorPressed = Color.Unspecified,

        infoMain = Color.Unspecified,
        infoSurface = Color.Unspecified,
        infoBorder = Color.Unspecified,
        infoHover = Color.Unspecified,
        infoPressed = Color.Unspecified,

        dangerMain = Color.Unspecified,
        dangerSurface = Color.Unspecified,
        dangerBorder = Color.Unspecified,
        dangerHover = Color.Unspecified,
        dangerPressed = Color.Unspecified,
    )
}