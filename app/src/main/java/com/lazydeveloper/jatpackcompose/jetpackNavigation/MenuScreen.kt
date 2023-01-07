package com.lazydeveloper.jatpackcompose.jetpackNavigation

import androidx.compose.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MenuScreen(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "This is Menu Screen")
    }
}