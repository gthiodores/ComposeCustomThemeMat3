package com.gthio.composecustomthememat3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gthio.composecustomthememat3.ui.theme.LucyTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val windowSizeClass = calculateWindowSizeClass(activity = this)

            LucyTheme(sizeClass = windowSizeClass.widthSizeClass) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = LucyTheme.colors.neutral10
                ) {
                    Box {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(
                                contentColor = LucyTheme.colors.neutral10,
                                disabledContentColor = LucyTheme.colors.neutral80,
                                containerColor = LucyTheme.colors.primaryMain,
                                disabledContainerColor = LucyTheme.colors.neutral60
                            ),
                            shape = ButtonDefaults.shape,
                        ) {
                            Text(
                                "${windowSizeClass.widthSizeClass} size: ${LucyTheme.typography.largeButton.fontSize}",
                                style = LucyTheme.typography.largeButton
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    ProvideTextStyle(value = LucyTheme.typography.largeTitle) {
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LucyTheme {
        Greeting("Android")
    }
}