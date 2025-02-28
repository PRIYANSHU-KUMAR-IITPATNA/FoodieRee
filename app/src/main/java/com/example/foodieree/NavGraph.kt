package com.example.foodieree

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController  // ✅ Use NavHostController instead of NavController
import androidx.navigation.compose.rememberNavController
import com.example.foodieree.HomeScreen
import com.example.foodieree.DetailScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavGraph(navController: NavHostController) {  // ✅ Change NavController to NavHostController
    NavHost(
        navController = navController,  // ✅ Now this matches the expected type
        startDestination = "home"
    ) {
        composable(route = "home") {
            HomeScreen(navController)
        }
        composable(route = "detail") {
            DetailScreen(navController)
        }
    }
}
