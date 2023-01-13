package com.example.kpcoder.navigation_destination_compose.DestinationNavigationSimple

import com.ramcosta.composedestinations.annotation.NavGraph


@NavGraph
annotation class HomeNavGraph(
    val start : Boolean = false
)


@NavGraph
annotation class AuthNavGraph(
    val start : Boolean = false
)