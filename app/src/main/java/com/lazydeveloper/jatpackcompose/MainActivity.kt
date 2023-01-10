package com.lazydeveloper.jatpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lazydeveloper.jatpackcompose.jetpackNavigation.*
import com.lazydeveloper.jatpackcompose.ui.theme.LittleLemonColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MessageCard(Message("Android", "Jetpack Compose"))

//            UpperPanel()

//            AppScreen()

//            LoginScreen()

//            HomeScreen()

            HomeScreenLittleLemon()

            //-------AnimatedButton
//            Dummy()
//            BottomSheetScaffold()

/*            val materialBlue700 = Color(0xFF1976D2)
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
            )*/

            //BottomNavigation
//            MyApp()


        }
    }


}

@Composable
fun Dummy(){
    var visible by remember{
        mutableStateOf(true)
    }
    Column() {
        AnimatedVisibility(visible = visible) {
            Text(text = "Hello")
        }
        Button(onClick = { visible = !visible}) {
            Text(text = "Button")
        }

    }
}

/*@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route) {
        composable(Home.route) {
//            HomeScreen(navController)
        }
        composable(Menu.route) {
            MenuScreen()
        }
    }
}*/

@Composable
fun MyApp(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { MyBottomNavigation(navController = navController) }) {
        Box(modifier = Modifier.padding(it)){
            NavHost(navController = navController, startDestination = Home.route){
                composable(Home.route){
                    HomeScreen(navController)
                }
                composable(Menu.route){
                    MenuScreen()
                }
                composable(Location.route){
                    LocationScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreenLittleLemon() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = { DrawerPanel(scaffoldState = scaffoldState, scope = scope) },
        bottomBar = { MyBottomNavigation(navController = navController) },
        topBar = {
            com.lazydeveloper.jatpackcompose.littleLemon.TopAppBar(
                scaffoldState = scaffoldState,
                scope = scope
            )
        }
    ) {
        Column {
//            UpperPanel()
//            LowerPanel()
            Box(modifier = Modifier.padding(it)){
                NavHost(navController = navController, startDestination = Home.route){
                    composable(Home.route){
                        HomeScreen(navController)
                    }
                    composable(Menu.route){
                        MenuScreen()
                    }
                    composable(Location.route){
                        LocationScreen()
                    }
                }
            }
        }

    }
}


@Composable
fun MyBottomNavigation(navController: NavController) {
    val destinationList = listOf(
        Menu,
        Home,
        Location
    )
    val selectedIndex = rememberSaveable {
        mutableStateOf(0)
    }
    BottomNavigation(modifier = Modifier.height(45.dp)) {

        destinationList.forEachIndexed { index, destination ->
            BottomNavigationItem(
                modifier = Modifier
                    .background(LittleLemonColor.cloud)
                    .offset(y = 5.dp),

                label = { Text(text = destination.title, fontSize = 10.sp) },

                icon = {
                    Icon(
                        painter = painterResource(id = destination.icon),
                        contentDescription = destination.title,
                        modifier = Modifier.height(20.dp)
                    )
                },

                selected = index == selectedIndex.value,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destinationList[index].route) {
                        popUpTo(Home.route)
                        launchSingleTop = true
                    }
                })
        }
    }
}

//----------------------------------------------------BottomSheetScaffold
/*@Composable
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
}*/



