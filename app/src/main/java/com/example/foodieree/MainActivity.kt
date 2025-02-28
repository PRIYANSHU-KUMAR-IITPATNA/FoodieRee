package com.example.foodieree

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.foodieree.NavGraph // ✅ Ensure this import is correct
import com.example.foodieree.ui.theme.AppTheme
import com.example.foodieree.ui.FoodReelListScreen// ✅ Ensure AppTheme is imported

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodReelListScreen()
            val navController = rememberNavController()
            AppTheme {
                NavGraph(navController)   // ✅ Ensure NavGraph is properly referenced
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    AppTheme {
        NavGraph(navController)   // ✅ Ensure this matches your actual function name
    }
}




