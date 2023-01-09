package com.lazydeveloper.jatpackcompose.littleLemon

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.ui.tooling.preview.Preview
import com.lazydeveloper.jatpackcompose.R
import com.lazydeveloper.jatpackcompose.ui.theme.LittleLemonColor

val DishRepository = arrayListOf<String>(

)

@Preview(showBackground = true)
@Composable
fun LowerPanel() {
//fun LowerPanel(navController: NavHostController? = null, dish: Dish) {

//    Card(onClick = {
//        navController?.navigate(DishDetails.route + "/${dish.id}")
//    })


    Card{
        Column(
            Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = stringResource(id = R.string.weekly_special),
                color = LittleLemonColor.charcoal,
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 10.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                Column() {
                    Text(
                        text = stringResource(id = R.string.greek_salad),
                        color = LittleLemonColor.charcoal,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 2.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.famous_greek_salad),
                        color = LittleLemonColor.charcoal,
                        fontSize = 16.sp,
                        modifier = Modifier.width(240.dp),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Text(
                        text = stringResource(id = R.string.price),
                        color = LittleLemonColor.charcoal,
                        fontSize = 15.sp,
                        modifier = Modifier.width(240.dp),
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.greek_salad),
                    contentDescription = "",
                    Modifier
                        .height(110.dp)
                        .clip(RoundedCornerShape(8.dp))

                )

            }
            Divider(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                thickness = 1.dp,
                color = LittleLemonColor.yellow
            )


        }
    }

}


/*
@Composable
fun DishDetails(id: Int) {
    val dish = requireNotNull(DishRepository.getDish(id))
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        TopAppBar()
        Image(
            painter = painterResource(id = dish.imageResource),
            contentDescription = "Dish image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(
                start = 10.dp,
                end = 10.dp
            )
        ) {
            Text(
                text = dish.name,
                style = MaterialTheme.typography.h1
            )
            Text(
                text = dish.description,
                style = MaterialTheme.typography.body1
            )
//            Counter()
            Button(
                onClick = { }
            ) {
                Text(
                    text = stringResource(id = R.string.order) + " $${dish.price}",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}
*/
