package com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.HomeNavGraph
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.ProfileScreenViewModel
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.AccountScreenDestination
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.HomeScreenDestination
import com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple.destinations.ProfileScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@HomeNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(navigator: DestinationsNavigator, value : String = "") {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {

            Text(text = "Home Screen ${value}")
            Spacer(modifier = Modifier.height(14.dp))
            Button(onClick = {
                navigator.navigate(
                    ProfileScreenDestination(
                        id = "This is Id",
                        fakeData = FakeData(name = "Krishna", age = 20, isAdult = true)
                    )
                )
            }) {
                    Text(text = "Click me")
            }
        }
        
    }
    
}

@HomeNavGraph
@Destination
@Composable
fun ProfileScreen(
    navigator: DestinationsNavigator,
    id : String,
    // Fake Data from data class
    fakeData : FakeData,
    viewModel: ProfileScreenViewModel = hiltViewModel()
) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {

            Text(text = "Profile Screen ${id} ${fakeData.name} ${fakeData.age} ${fakeData.isAdult}")
            Spacer(modifier = Modifier.height(14.dp))
            Button(onClick = {

                // 1st variant of popBackStack()
//                navigator.popBackStack()
                navigator.navigate(AccountScreenDestination)
            }) {
                Text(text = "Go back")
            }
        }

    }
    
}

@HomeNavGraph
@Destination
@Composable
fun AccountScreen(navigator: DestinationsNavigator) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {

            Text(text = "Account Screen")
            Spacer(modifier = Modifier.height(14.dp))
            Button(onClick = {
                // First variant
                //navigator.popBackStack()
                // 2st variant of popBackStack()
                navigator.popBackStack(
                   HomeScreenDestination,
                    inclusive = false,
                    saveState = false
                )
                // inclusive true means it will pop HomeScreenDestination too
                // inclusive false means it will not pop HomeScreenDestination
            }) {
                Text(text = "Go back")
            }
        }

    }
    
}

// This is Fake data Class
data class FakeData(val name: String, val age: Int, val isAdult: Boolean) : java.io.Serializable