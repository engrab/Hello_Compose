package com.example.myapplication.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable
fun ShoeItem(data: DataObj.Data) {

    Column(
        modifier = Modifier
            .width(100.dp)
            .height(200.dp).padding(top = 5.dp, start = 5.dp)
    ) {

        Card(
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
        ) {
            Image(painterResource(id = data.image), contentDescription = null,
                )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 5.dp, top = 5.dp)
                .align(alignment = Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = data.name,
                modifier = Modifier.fillMaxWidth().align(alignment = Alignment.CenterHorizontally),)

            Text(text = "${data.price}", modifier = Modifier.fillMaxWidth().align(alignment = Alignment.CenterHorizontally))

            Button(onClick = {}) {
                Text(text = "Buy")
            }
        }


    }


}

@Preview(showSystemUi = true)
@Composable
fun ShoeItemPreview() {
    ShoeItem(data = DataObj.Data(R.drawable.shoe1, "Nike", 330))
}