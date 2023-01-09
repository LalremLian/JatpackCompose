package com.lazydeveloper.jatpackcompose.littleLemon

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lazydeveloper.jatpackcompose.R
import com.lazydeveloper.jatpackcompose.ui.theme.LittleLemonColor

@Composable
fun UpperPanel() {

    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = LittleLemonColor.green)
    ) {
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 32.sp,
            color = LittleLemonColor.yellow,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 24.sp,
            color = LittleLemonColor.cloud,
            modifier = Modifier.padding(start = 20.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = stringResource(id = R.string.description),
                fontSize = 16.sp,
                color = LittleLemonColor.cloud,
                modifier = Modifier.width(190.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ribs),
                contentDescription = "",
                Modifier
                    .height(110.dp)
                    .clip(RoundedCornerShape(8.dp))

            )

        }
        Button(
            onClick = {
                      Toast.makeText(context,"Successfully Ordered", Toast.LENGTH_SHORT).show()
                      },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(start = 20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = LittleLemonColor.yellow)
        ) {
            Text(text = stringResource(id = R.string.order))
        }


    }
}

@Preview(showBackground = true)
@Composable
fun UpperPanelPreview(){
    UpperPanel()
}