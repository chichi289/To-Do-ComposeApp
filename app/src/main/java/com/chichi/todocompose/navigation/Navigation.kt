package com.chichi.todocompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.chichi.todocompose.navigation.destinations.listComposable
import com.chichi.todocompose.navigation.destinations.splashComposable
import com.chichi.todocompose.navigation.destinations.taskComposable
import com.chichi.todocompose.ui.viewmodels.SharedViewModel
import com.chichi.todocompose.utils.Constants.SPLASH_SCREEN
import com.google.accompanist.navigation.animation.AnimatedNavHost

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController)
    }

    AnimatedNavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            sharedViewModel = sharedViewModel,
            navigateToListScreen = screen.task
        )
    }
}