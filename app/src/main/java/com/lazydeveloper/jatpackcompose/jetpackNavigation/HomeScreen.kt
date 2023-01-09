package com.lazydeveloper.jatpackcompose.jetpackNavigation

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.lazydeveloper.jatpackcompose.littleLemon.LowerPanel
import com.lazydeveloper.jatpackcompose.littleLemon.UpperPanel

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
/*        Text(text = "Home Screen")
        Button(onClick = {
            navController.navigate(Home.route)
        }) {
            Text(text = "Next")
        }*/

        UpperPanel()
        LowerPanel()

    }
}
