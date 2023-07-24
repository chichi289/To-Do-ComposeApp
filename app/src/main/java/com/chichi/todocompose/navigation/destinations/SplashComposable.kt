package com.chichi.todocompose.navigation.destinations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutVertically
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import com.chichi.todocompose.ui.screens.splash.SplashScreen
import com.chichi.todocompose.utils.Constants
import com.google.accompanist.navigation.animation.composable

@ExperimentalAnimationApi
@ExperimentalMaterialApi
fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit
) {
    composable(
        route = Constants.SPLASH_SCREEN,
        exitTransition = {
            slideOutVertically(
                targetOffsetY = { fullHeight -> -fullHeight },
                animationSpec = tween(durationMillis = 300)
            )
        }
    ) {
        SplashScreen(
            navigateToListScreen = navigateToListScreen
        )
    }
}