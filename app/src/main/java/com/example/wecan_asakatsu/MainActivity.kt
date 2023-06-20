package com.example.wecan_asakatsu

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.wecan_asakatsu.navigation.AsakatsuNavigation
import com.example.wecan_asakatsu.navigation.AsakatsuScreens
import com.example.wecan_asakatsu.ui.theme.WeCan_asakatsuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AsakatsuApp()
        }
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AsakatsuApp(
    ) {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = {
                BottomNavigation(
                    backgroundColor = Color.White
                ) {

                    BottomNavigationItem(
                        icon = { Icon(Icons.Default.Home, contentDescription = null) },
                        selected = navController.currentBackStackEntry?.destination?.route == AsakatsuScreens.HomeScreen.name,
                        onClick = {
                            navController.navigate(AsakatsuScreens.HomeScreen.name) {
                                launchSingleTop = true
                            }
                        }
                    )

                    BottomNavigationItem(
                        icon = { Icon(Icons.Default.AccountCircle, contentDescription = null) },
                        selected = navController.currentBackStackEntry?.destination?.route == AsakatsuScreens.MyPageScreen.name,
                        onClick = {
                            navController.navigate(AsakatsuScreens.MyPageScreen.name) {
                                launchSingleTop = true
                            }
                        }
                    )
                }
            }
        ) {
            AsakatsuNavigation(navController)
        }
    }
}