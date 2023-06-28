package com.example.wecan_asakatsu.ui.screen.mypage

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.wecan_asakatsu.components.GradationTopbar
import kotlinx.coroutines.coroutineScope

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MypageScreen() {

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()


    androidx.compose.material.Scaffold(
        topBar = {
            GradationTopbar(title = "WECAN") {
              IconButton(onClick = {
                  //ここでドロワー表示のトグルを切リかえ
              }) {
                  Icon(Icons.Filled.Menu, contentDescription = "")
              }
            }
        }


    ) {

    }

}
