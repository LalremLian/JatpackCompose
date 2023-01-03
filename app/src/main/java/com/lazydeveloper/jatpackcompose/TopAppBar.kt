package com.lazydeveloper.jatpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lazydeveloper.jatpackcompose.ui.theme.JatpackComposeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun TopAppBar(scaffoldState: ScaffoldState? = null, scope: CoroutineScope? = null) {
    Row(Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween) {
        IconButton(onClick = {
            scope?.launch { scaffoldState?.drawerState?.open() }
        }) {
            Image(painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = "Drawer Menu")
        }
        Text(text = "Dashboard",
        Modifier.padding(top = 15.dp))
        IconButton(onClick = { }) {
            Image(painter = painterResource(id = R.drawable.ic_cart),
                contentDescription = "Cart")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JatpackComposeTheme {
        TopAppBar()
    }
}