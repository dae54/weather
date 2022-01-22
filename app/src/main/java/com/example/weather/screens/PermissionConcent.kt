package com.example.weather.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.R
import com.example.weather.ui.theme.RainyGrey
import com.example.weather.ui.theme.SunnyGreen
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState

@ExperimentalPermissionsApi
@Composable
fun LocationPermissionDetails(permissionState: PermissionState) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = rememberVectorPainter(image = Icons.Filled.LocationOn),
            contentDescription = stringResource(id = R.string.location_permission_content_description),
            modifier = Modifier.size(68.dp),
        )
        Text(
            text = stringResource(id = R.string.location_permission_description),
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            color = Color.Black
        )
        Button(onClick = { permissionState.launchPermissionRequest() }) {
            Text(text = stringResource(id = R.string.location_permission_continue))
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun LocationPermissionNotAvailable() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(RainyGrey)
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = rememberVectorPainter(image = Icons.Filled.LocationOn),
            contentDescription = stringResource(id = R.string.location_permission_content_description),
            modifier = Modifier.size(68.dp),
        )
        Text(
            text = stringResource(id = R.string.location_permission_not_available),
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}
