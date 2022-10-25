package com.gthio.composecustomthememat3.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.gthio.composecustomthememat3.R

@Immutable
data class LucyTypography(
    val largeTitle: TextStyle,
    val mediumTitle: TextStyle,
    val smallTitle: TextStyle,
    val xSmallTitle: TextStyle,
    val xxSmallTitle: TextStyle,
    val xLargeHeadline: TextStyle,
    val largeHeadline: TextStyle,
    val mediumHeadline: TextStyle,
    val smallHeadline: TextStyle,
    val xSmallHeadline: TextStyle,
    val xxSmallHeadline: TextStyle,
    val largeBody: TextStyle,
    val mediumBody: TextStyle,
    val smallBody: TextStyle,
    val xSmallBody: TextStyle,
    val xxSmallBody: TextStyle,
    val largeButton: TextStyle,
    val mediumButton: TextStyle,
    val smallButton: TextStyle,
    val largeCaption: TextStyle,
    val smallCaption: TextStyle,
    val standardLabel: TextStyle
)

val LucyFontFamily = FontFamily(
    fonts = listOf(
        Font(R.font.nunitosans_bold),
        Font(R.font.nunitosans_extrabold),
        Font(R.font.nunitosans_semibold),
        Font(R.font.nunitosans_regular)
    )
)

class LucyFontWeight {
    companion object {
        val Regular: FontWeight = FontWeight(400)
        val SemiBold: FontWeight = FontWeight(600)
        val Bold: FontWeight = FontWeight(700)
        val ExtraBold: FontWeight = FontWeight(800)
    }
}

val LucyTabletTypography = LucyTypography(
    largeTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 64.sp,
        fontFamily = LucyFontFamily
    ),
    mediumTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 28.sp,
        fontFamily = LucyFontFamily
    ),
    smallTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 24.sp,
        fontFamily = LucyFontFamily
    ),
    xSmallTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 20.sp,
        fontFamily = LucyFontFamily
    ),
    xxSmallTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 20.sp,
        fontFamily = LucyFontFamily
    ),
    xLargeHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 28.sp,
        fontFamily = LucyFontFamily
    ),
    largeHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 28.sp,
        fontFamily = LucyFontFamily
    ),
    mediumHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 24.sp,
        fontFamily = LucyFontFamily
    ),
    smallHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 20.sp,
        fontFamily = LucyFontFamily
    ),
    xSmallHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    xxSmallHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    largeBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 24.sp,
        fontFamily = LucyFontFamily
    ),
    mediumBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 20.sp,
        fontFamily = LucyFontFamily
    ),
    smallBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    xSmallBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    xxSmallBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    largeButton = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    mediumButton = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    smallButton = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    largeCaption = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    smallCaption = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    standardLabel = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
)

val LucyMobileTypography = LucyTypography(
    largeTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 24.sp,
        fontFamily = LucyFontFamily
    ),
    mediumTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 20.sp,
        fontFamily = LucyFontFamily
    ),
    smallTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    xSmallTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    xxSmallTitle = TextStyle(
        fontWeight = LucyFontWeight.ExtraBold,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    xLargeHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 20.sp,
        fontFamily = LucyFontFamily
    ),
    largeHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 20.sp,
        fontFamily = LucyFontFamily
    ),
    mediumHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    smallHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    xSmallHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    xxSmallHeadline = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    largeBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 16.sp,
        fontFamily = LucyFontFamily
    ),
    mediumBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    smallBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    xSmallBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    xxSmallBody = TextStyle(
        fontWeight = LucyFontWeight.Regular,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    largeButton = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    mediumButton = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 14.sp,
        fontFamily = LucyFontFamily
    ),
    smallButton = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    largeCaption = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 12.sp,
        fontFamily = LucyFontFamily
    ),
    smallCaption = TextStyle(
        fontWeight = LucyFontWeight.SemiBold,
        fontSize = 10.sp,
        fontFamily = LucyFontFamily
    ),
    standardLabel = TextStyle(
        fontWeight = LucyFontWeight.Bold,
        fontSize = 10.sp,
        fontFamily = LucyFontFamily
    ),
)

val LocalLucyTypography = staticCompositionLocalOf {
    LucyTypography(
        largeTitle = TextStyle.Default,
        mediumTitle = TextStyle.Default,
        smallTitle = TextStyle.Default,
        xSmallTitle = TextStyle.Default,
        xxSmallTitle = TextStyle.Default,
        xLargeHeadline = TextStyle.Default,
        largeHeadline = TextStyle.Default,
        mediumHeadline = TextStyle.Default,
        smallHeadline = TextStyle.Default,
        xSmallHeadline = TextStyle.Default,
        xxSmallHeadline = TextStyle.Default,
        largeBody = TextStyle.Default,
        mediumBody = TextStyle.Default,
        smallBody = TextStyle.Default,
        xSmallBody = TextStyle.Default,
        xxSmallBody = TextStyle.Default,
        largeButton = TextStyle.Default,
        mediumButton = TextStyle.Default,
        smallButton = TextStyle.Default,
        largeCaption = TextStyle.Default,
        smallCaption = TextStyle.Default,
        standardLabel = TextStyle.Default
    )
}