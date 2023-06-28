package com.example.wecan_asakatsu.ui.screen.mypage

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.wecan_asakatsu.components.GradationTopbar
import kotlinx.coroutines.coroutineScope

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MypageScreen() {

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
