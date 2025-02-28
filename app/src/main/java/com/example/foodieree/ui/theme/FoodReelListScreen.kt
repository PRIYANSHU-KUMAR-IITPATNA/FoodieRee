package com.example.foodieree.ui


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodieree.model.FoodReel
import com.example.foodieree.model.FoodReelData

@Composable
fun FoodReelListScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize()   ) {
        items(FoodReelData.foodReels) { foodReel ->
            FoodReelItem(foodReel)
        }
    }
}
