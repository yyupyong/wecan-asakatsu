package com.example.wecan_asakatsu.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun GradationTopbar(
){
    val gradient = Brush.verticalGradient(
        colors = listOf(Color.Red, Color.Blue)
    )
    TopAppBar(
        modifier = Modifier.background(gradient),
        backgroundColor = Color.Transparent,
        contentColor = Color.White,
    ) {
        Text(text = "WECAN朝活")
    }
 }

