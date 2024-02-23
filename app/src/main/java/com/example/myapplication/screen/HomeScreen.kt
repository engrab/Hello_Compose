package com.example.myapplication.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable
fun HomeScreen() {

    Column {


        Row {
            Column(modifier = Modifier.fillMaxWidth(.9f)) {

                Text(text = "Hi Jacky")
                Text(text = "Good Morning")
            }

            Image(imageVector = Icons.Default.AccountCircle, contentDescription = null)

        }

        Row {

            TextField(value = "Search", onValueChange = {})

            Image(imageVector = Icons.Default.Search, contentDescription = null)


        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .align(alignment = Alignment.CenterHorizontally)) {
            Text(text = "All")
            Text(text = "Nike")
            Text(text = "Addras")
            Text(text = "Converse")
        }

        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(DataObj.dataList) {
                    ShoeItem(data = it)
                }
            }

        }

    }


}





@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

object DataObj {

    data class Data(
         @DrawableRes val  image: Int,
         val name: String,
         val price: Int
    )


        var dataList =  listOf(
            Data(
                image = R.drawable.shoe1,
                name = "Nike band",
                price = 500
            ),
            Data(
                image = R.drawable.shoe2,
                name = "Nike band",
                price = 510
            ),
            Data(
                image = R.drawable.shoe3,
                name = "Nike band",
                price = 520
            ),
            Data(
                image = R.drawable.shoe4,
                name = "Nike band",
                price = 530
            ),
            Data(
                image = R.drawable.shoe5,
                name = "Nike band",
                price = 540
            ),
            Data(
                image = R.drawable.shoe6,
                name = "Nike band",
                price = 550
            ),

            )

}