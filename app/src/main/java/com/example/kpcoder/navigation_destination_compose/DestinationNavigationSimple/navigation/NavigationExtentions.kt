package com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.navigation
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.AccountScreen
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.HomeScreen
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.NavGraphs
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.ProfileScreen
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.auth.LoginScreen
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.auth.SignUpScreen
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.*
import com.ramcosta.composedestinations.utils.composable


// NavGraphBuilder
fun NavGraphBuilder.authNavigation(navController : NavController) {
    // the create navigation()
    // startDestination where to start your app

    // SubGraph 1
    navigation(startDestination = SignUpScreenDestination.route, route = NavGraphs.auth.route){
        // composable then import the composable
        // this composable for signupScreen
        composable(SignUpScreenDestination) {
            SignUpScreen(navigator = destinationsNavigator(navController))
        }
        // this composable for login screen
        composable(LoginScreenDestination) {
            LoginScreen(navigator = destinationsNavigator(navController))
        }
    }
}

// This is second NavGraphBuilder
fun NavGraphBuilder.homeNavigation(navController: NavController) {
    // this navigation for HomeNavGraph SubGraph2
    navigation(startDestination = HomeScreenDestination.route, route = NavGraphs.home.route) {
        // composable then import the composable
        // this composable for Home Screen
        composable(HomeScreenDestination) {
            HomeScreen(navigator = destinationsNavigator(navController), navArgs.value)
        }
        // this composable for Profile screen
        composable(ProfileScreenDestination) {
            ProfileScreen(
                navigator = destinationsNavigator(navController),
                id = navArgs.id,
                fakeData = navArgs.fakeData
            )
        }
        // This composable for AccountScreen
        composable(AccountScreenDestination) {
            AccountScreen(navigator = destinationsNavigator(navController))
        }
    }
}