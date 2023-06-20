package com.example.wecan_asakatsu.navigation

import java.lang.IllegalArgumentException

enum class AsakatsuScreens {
    HomeScreen,
    MyPageScreen;

    companion object {

        fun fromRoute(route:String):AsakatsuScreens
        = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            MyPageScreen.name -> MyPageScreen
            null-> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}