package com.lazydeveloper.jatpackcompose.jetpackNavigation

import androidx.compose.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment

@Composable
fun HomeScreen() {
    Column(modifier = androidx.compose.ui.Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
        Text(text = "Home Screen")
/*        Button(onClick = {
            navController.navigate(Home.route)
        }) {
            Text(text = "Next")
        }*/
    }
}