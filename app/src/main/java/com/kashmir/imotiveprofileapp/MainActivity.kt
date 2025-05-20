package com.kashmir.imotiveprofileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kashmir.imotiveprofileapp.screens.ProfileScreen
import com.kashmir.imotiveprofileapp.ui.theme.IMotiveProfileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMotiveProfileAppTheme {
                ProfileScreen()
            }
        }
    }
}