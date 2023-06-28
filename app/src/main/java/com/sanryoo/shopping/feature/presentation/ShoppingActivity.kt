package com.sanryoo.shopping.feature.presentation

import android.Manifest
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHost
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.core.app.ActivityCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.sanryoo.shopping.feature.presentation._component.CustomBottomNavigation
import com.sanryoo.shopping.feature.presentation._component.SnackBar
import com.sanryoo.shopping.feature.util.Screen
import com.sanryoo.shopping.ui.theme.ShoppingTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.FlowPreview

@FlowPreview
@ExperimentalPermissionsApi
@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@ExperimentalAnimationApi
@ExperimentalMaterialApi
@AndroidEntryPoint
class ShoppingActivity : ComponentActivity() {

    private val viewModel: ShoppingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LOCKED
        installSplashScreen()
        requestNotificationPermission()

        val startDestination = intent.getStringExtra("route") ?: Screen.Home.route

        setContent {
            ShoppingTheme {
                val numberOfNotifications = viewModel.numberOfNotifications.collectAsStateWithLifecycle().value
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    scaffoldState = scaffoldState,
                    snackbarHost = { hostState ->
                        SnackbarHost(hostState = hostState) { snackBarData ->
                            SnackBar(snackBarData = snackBarData)
                        }
                    },
                    bottomBar = {
                        CustomBottomNavigation(navController, numberOfNotifications)
                    }
                ) {
                    ShoppingNavGraph(startDestination ,navController, scaffoldState)
                }
            }
        }
    }

    private fun requestNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ActivityCompat.requestPermissions(
                this@ShoppingActivity,
                arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                0
            )
        }
    }
}
