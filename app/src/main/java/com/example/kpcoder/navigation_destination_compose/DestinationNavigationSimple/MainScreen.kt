package com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.auth.LoginScreen
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.auth.SignUpScreen
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.*
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.navigation.authNavigation
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.navigation.homeNavigation
import com.example.kpcoder.navigation_destination_compose.ui.theme.Navigation_Destination_ComposeTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.utils.composable

@Composable
fun MAinScreen() {

    Navigation_Destination_ComposeTheme {
        // So now we are use for nested navigation
        // so first we have to create nav controller because NavHost need Nav controller
        val navController = rememberNavController()
        // than create NavHost and pass the navController than don't pass Graphs pass startDestination
        // pass the startDestinations in NavGraphs.StartAnnotationGraph.route
        NavHost(navController =navController , startDestination = NavGraphs.auth.route){

            // than you will go to NavGraphBuilder or Navigation Extentions
            // these are two extentions
            authNavigation(navController)
            homeNavigation(navController)

        }

    // this is for only one navGraph
        // this is use for simple navigation
      //  DestinationsNavHost(navGraph = NavGraphs.root)

    }

}