package com.gthio.composecustomthememat3.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

//private val DarkColorPalette = darkColorScheme(
//    primary = Purple200,
//    inversePrimary = Purple700,
//    secondary = Teal200
//)
//
//private val LightColorPalette = lightColorScheme(
//    primary = Purple500,
//    inversePrimary = Purple700,
//    secondary = Teal200
//)
//
//@Composable
//fun ComposeCustomThemeMat3Theme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
//    content: @Composable () -> Unit
//) {
//    val colors = if (darkTheme) {
//        DarkColorPalette
//    } else {
//        LightColorPalette
//    }
//
//    MaterialTheme(
//        colorScheme = colors,
//        typography = Typography(),
//        shapes = Shapes,
//        content = content,
//    )
//}

@Composable
fun LucyTheme(
    sizeClass: WindowWidthSizeClass = WindowWidthSizeClass.Compact,
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val lucyColor = LucyColors(
        primaryMain = PrimaryMain,
        primarySurface = PrimarySurface,
        primaryBorder = PrimaryBorder,
        primaryHover = PrimaryHover,
        primaryPressed = PrimaryPressed,
        primaryFocus = PrimaryFocus,

        neutral10 = Neutral10,
        neutral20 = Neutral20,
        neutral30 = Neutral30,
        neutral40 = Neutral40,
        neutral50 = Neutral50,
        neutral60 = Neutral60,
        neutral70 = Neutral70,
        neutral80 = Neutral80,
        neutral90 = Neutral90,
        neutral100 = Neutral100,

        successMain = SuccessMain,
        successSurface = SuccessSurface,
        successBorder = SuccessBorder,
        successHover = SuccessHover,
        successPressed = SuccessPressed,

        errorMain = ErrorMain,
        errorSurface = ErrorSurface,
        errorBorder = ErrorBorder,
        errorHover = ErrorHover,
        errorPressed = ErrorPressed,

        infoMain = InfoMain,
        infoSurface = InfoSurface,
        infoBorder = InfoBorder,
        infoHover = InfoHover,
        infoPressed = InfoPressed,

        dangerMain = DangerMain,
        dangerSurface = DangerSurface,
        dangerBorder = DangerBorder,
        dangerHover = DangerHover,
        dangerPressed = DangerPressed,
    )

    // TODO: Replace with new typography
    val typography = if (sizeClass == WindowWidthSizeClass.Compact) {
        LucyMobileTypography
    } else {
        LucyTabletTypography
    }

//    val typography = LucyMobileTypography

    CompositionLocalProvider(
        LocalLucyColors provides lucyColor,
        LocalLucyTypography provides typography,
        content = content
    )
}

object LucyTheme {
    val colors: LucyColors
        @Composable
        get() = LocalLucyColors.current
    val typography: LucyTypography
        @Composable
        get() = LocalLucyTypography.current
}