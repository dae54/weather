package com.example.weather.screens

import android.view.Surface
import android.widget.ListView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun MainScreen(){
    val scrollState = rememberScrollState()
    val data =  IntArray(5)

    Column(modifier = Modifier
        .fillMaxSize()
        .absolutePadding(top=50.dp)) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally){
            Image(
                painter = painterResource(id = R.drawable.bulb_1),
                contentDescription = stringResource(id = R.string.location_permission_content_description),
                modifier = Modifier.size(68.dp),
            )

            Text(text = "Good Evening Daniel.",
                modifier = Modifier
                    .padding(vertical = 80.dp),
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                )
            )
        }

        LazyColumn (
            modifier= Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally

            ){
            items(count = data.size) {
                Component()
            }
        }


//        Column(
////            horizontalArrangement = Arrangement.Center,
//
//            modifier = Modifier.fillMaxWidth()
//                .scrollable(orientation = Orientation.Vertical, state = scrollState),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Surface(
//                elevation = 15.dp,
//                shape = RoundedCornerShape(5),
//                modifier = Modifier
//                    .height(130.dp)
//                    .fillMaxWidth(0.95f)) {
//                Box(modifier = Modifier
//                    .background(
//                        brush = Brush.horizontalGradient(
//                            colors = listOf(Color.White, Color(0xFFA8E1FA)),
//                            startX = 0f
//                        )
//                    )
//                    .height(200.dp)
//                    .fillMaxWidth(0.9f)
//                    .padding(20.dp)){
//                    Text(text = "Good Evening Daniel!! dddd")
//                    Text(text = "Good Evening Daniel!! asdff")
//                }
//            }
//        }
    }
}

@Composable
fun Component (){
    Surface(
        elevation = 5.dp,
        shape = RoundedCornerShape(5),
        modifier = Modifier
            .height(130.dp)
            .clickable {  }
            .fillMaxWidth(0.95f)) {
        Box(modifier = Modifier
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(Color.White, Color(0xFFA8E1FA)),
                    startX = 0f
                )
            )
            .height(200.dp)
            .fillMaxWidth(0.9f)
            .padding(20.dp)){
            Text(text = "Good Evening Daniel!! dddd")
            Text(text = "Good Evening Daniel!!")
        }
    }
}