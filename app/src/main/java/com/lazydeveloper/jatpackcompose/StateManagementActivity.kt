package com.lazydeveloper.jatpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun AppScreen(){

    var counter by rememberSaveable{
//    var counter by remember{
        mutableStateOf(0)
    }

    GreekSalad(counter, {counter++}, {counter--})
}

@Composable
fun GreekSalad(counter: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {

    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Greek Salad",
            fontSize = 25.sp
        )
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { onDecrement() }) {
                Image(painter = painterResource(id = R.drawable.ic_remove),
                    contentDescription = "Remove")
            }
            Text(
                text = "$counter",
                fontSize = 25.sp
            )
            IconButton(onClick = { onIncrement() }) {
                Image(painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = "Add")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreekSaladPreview() {
    AppScreen()
}