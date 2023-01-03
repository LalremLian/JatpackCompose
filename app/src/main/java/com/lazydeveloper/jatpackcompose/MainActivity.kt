package com.lazydeveloper.jatpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lazydeveloper.jatpackcompose.ui.theme.JatpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MessageCard(Message("Android", "Jetpack Compose"))

//            UpperPanel()

//            AppScreen()

//            LoginScreen()

//            HomeScreen()

//            BottomSheetScaffold()

            val materialBlue700 = Color(0xFF1976D2)
            val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
            Scaffold(
                scaffoldState = scaffoldState,
                topBar = {
                    TopAppBar(
                        title = { Text(resources.getString(R.string.app_name)) },
                        contentColor = Color.White,
                        backgroundColor = materialBlue700
                    )
                },
                content = { paddingValues ->
                    MenuContent(paddingValues = paddingValues)
                }
            )
        }
    }


}

@Composable
fun HomeScreen(){
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = { DrawerPanel(scaffoldState = scaffoldState, scope = scope) },
        topBar = {
            TopAppBar(scaffoldState = scaffoldState, scope = scope)
        }
    ) {
        Column() {
            UpperPanel()
        }

    }
}

data class Message(val author: String, val body: String)

//Added extra functions

@Composable
fun RestaurantName(name: String, size: Int) {
    Text(
        text = name,
        fontSize = size.sp
    )
}

//----------------------------------------------------BottomSheetScaffold
@Composable
fun BottomSheetScaffold() {
    BottomSheetScaffold(
        bottomSheet = {
            BottomSheet(
                onCloseRequest = {
                    // Add logic to handle the bottom sheet closing
                }
            ) {
                // Add content to be displayed in the bottom sheet
            }
        },
        bodyContent = {
            // Add content to be displayed in the body
        }
    )
}

@Preview(showBackground = true)
@Composable
fun RestaurantNamePreview() {
    JatpackComposeTheme {
        RestaurantName(
//            name = stringResource(id = R.string.title),
            name = "I feel Good too",
            size = 32
        )
    }
}

@Composable
fun MessageCard(msg: com.lazydeveloper.jatpackcompose.Message) {
    // Add padding around our message
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                .size(40.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    JatpackComposeTheme {
        MessageCard(Message("Johnson Bom", "Bawm phun lak ah mimawl pakhat asi"))
    }

}


/*@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JatpackComposeTheme {
        Greeting("Android")
        
//        RestaurantName(name = "Android")
    }
}*/


