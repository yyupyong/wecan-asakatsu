package com.example.wecan_asakatsu.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.wecan_asakatsu.ui.screen.home.HomeScreen
import com.example.wecan_asakatsu.ui.screen.mypage.MypageScreen

@Composable
fun AsakatsuNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AsakatsuScreens.MyPageScreen.name
    ) {
        composable(AsakatsuScreens.HomeScreen.name) { HomeScreen() }
        composable(AsakatsuScreens.MyPageScreen.name) { MypageScreen() }
    }
}
