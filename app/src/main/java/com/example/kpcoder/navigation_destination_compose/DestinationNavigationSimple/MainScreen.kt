package com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple

import androidx.compose.runtime.Composable
import com.example.kpcoder.navigation_destination_compose.ui.theme.Navigation_Destination_ComposeTheme
import com.ramcosta.composedestinations.DestinationsNavHost

@Composable
fun MAinScreen() {

    Navigation_Destination_ComposeTheme {
        
        DestinationsNavHost(navGraph = NavGraphs.root)

    }

}