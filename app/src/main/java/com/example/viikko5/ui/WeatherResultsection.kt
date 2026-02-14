package com.example.viikko5.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.viikko5.data.model.WeatherResponse

@Composable
fun WeatherResultSection(weather: WeatherResponse) {

    Column(modifier = Modifier.padding(top = 16.dp)) {

        Text(text = "City: ${weather.name}")
        Text(text = "Temperature: ${weather.main.temp} °C")
        Text(text = "Description: ${weather.weather.firstOrNull()?.description}")
    }
}
