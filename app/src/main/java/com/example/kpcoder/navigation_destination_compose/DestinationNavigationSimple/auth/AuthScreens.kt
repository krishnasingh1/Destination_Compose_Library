package com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.AuthNavGraph
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.FakeData
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.HomeScreenDestination
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.LoginScreenDestination
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.ProfileScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@AuthNavGraph(start = true)
@Destination
@Composable
fun SignUpScreen(navigator: DestinationsNavigator) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {

            Text(text = "SignUp Screen")
            Spacer(modifier = Modifier.height(14.dp))
            Button(onClick = {
                navigator.navigate(
                   LoginScreenDestination()
                )
            }) {
                Text(text = "Go to LoginScreen")
            }
        }

    }
    
}

@AuthNavGraph
@Destination
@Composable
fun LoginScreen(navigator: DestinationsNavigator) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {

            Text(text = "Login Screen")
            Spacer(modifier = Modifier.height(14.dp))
            Button(onClick = {
                navigator.navigate(
                   HomeScreenDestination(value = "This is value")
                )
            }) {
                Text(text = "Go to HomeNavGraph")
            }
        }

    }
    
}