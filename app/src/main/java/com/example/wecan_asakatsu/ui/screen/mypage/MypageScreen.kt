package com.example.wecan_asakatsu.ui.screen.mypage

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.wecan_asakatsu.components.GradationTopbar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MypageScreen() {

    androidx.compose.material.Scaffold(
        topBar = {
            GradationTopbar(title = "WECAN") {
                //ここでドロワーのComposableを渡す
            }
        }

    ) {

    }

}
