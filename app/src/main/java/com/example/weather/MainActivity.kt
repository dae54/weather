package com.example.weather

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.graphics.Color
import com.example.weather.screens.LocationPermissionDetails
import com.example.weather.screens.LocationPermissionNotAvailable
import com.example.weather.screens.MainScreen
import com.example.weather.ui.theme.WeatherTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionRequired
import com.google.accompanist.permissions.rememberPermissionState
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    @ExperimentalPermissionsApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val permission = rememberPermissionState(permission = Manifest.permission.ACCESS_FINE_LOCATION)

            // REMOVE STATUS BAR COLOR
            val systemUiController = rememberSystemUiController()

            systemUiController.setStatusBarColor(
                color = Color.Transparent,
                darkIcons = true
            )

            PermissionRequired(
                permissionState = permission,
                permissionNotGrantedContent = { LocationPermissionDetails(permission) },
                permissionNotAvailableContent = { LocationPermissionNotAvailable() }
            ) {
                WeatherTheme {
                    Surface(color = MaterialTheme.colors.background) {
                        MainScreen()
                    }
                }
            }
        }
    }
}

