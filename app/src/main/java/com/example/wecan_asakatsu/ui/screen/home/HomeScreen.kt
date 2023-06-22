@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.wecan_asakatsu.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(topBar = { HomeScreenTopbar() }) {

    }

}

@Composable
fun HomeScreenTopbar() {
    TopAppBar(
        title = { Text(text = "WECAN朝活") },
        colors = TopAppBarDefaults.smallTopAppBarColors()
    )
}