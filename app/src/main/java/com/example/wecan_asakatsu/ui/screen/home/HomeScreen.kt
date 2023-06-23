@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.wecan_asakatsu.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.contentColorFor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(topBar = { HomeTopAppBar("WECAN朝活") }) {

        HomeContent()

    }

}

//ここにHomeScreenの主な要素を配置する
//この部分がImageと各Challengeへの動線、画像がないのでここはあとでそうやさんに送ってもらう
@Composable
fun HomeContent() {
    Column() {
//        Image(painter = , contentDescription = )

//        LazyColumn()
    }
}

@Composable
fun HomeTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFf6f6f6),
    contentColor: Color = contentColorFor(backgroundColor),
) {
    Surface(
        color = backgroundColor,
        contentColor = contentColor,
        modifier = modifier
            .height(100.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = title,
            style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
    }
}

