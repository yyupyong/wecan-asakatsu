package com.example.wecan_asakatsu.navigation

import android.annotation.SuppressLint
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AsakatsuNavigation() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    selected = navController.currentBackStackEntry?.destination?.route == AsakatsuScreens.HomeScreen.name,
                    onClick = {
                        navController.navigate(AsakatsuScreens.HomeScreen.name) {
                            launchSingleTop = true
                        }
                    }
                )
                BottomNavigation {
                    BottomNavigationItem(
                        icon = { Icon(Icons.Default.Home, contentDescription = null) },
                        selected = navController.currentBackStackEntry?.destination?.route == AsakatsuScreens.HomeScreen.name,
                        onClick = {
                            navController.navigate(AsakatsuScreens.HomeScreen.name) {
                                launchSingleTop = true
                            }
                        }
                    )
                }
            }
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = AsakatsuScreens.MyPageScreen.name
        ) {

        }
    }
}
