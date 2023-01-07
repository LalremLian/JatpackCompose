package com.lazydeveloper.jatpackcompose.jetpackNavigation

import com.lazydeveloper.jatpackcompose.R

interface Destinations{
    val route: String
    val icon: Int
    val title: String
}

object Home : Destinations{
    override val route = "Home"
    override val icon = R.drawable.ic_home
    override val title = "HomeTab"
}

object Menu : Destinations{
    override val route = "Menu"
    override val icon = R.drawable.ic_menu
    override val title = "MenuTab"
}

object Location : Destinations{
    override val route = "Location"
    override val icon = R.drawable.ic_location
    override val title = "LocationTab"
}