package com.example.weather.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.R
import com.example.weather.ui.model.CityWeather
import com.example.weather.ui.theme.WeatherTheme


@Composable
fun Neutral() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_action_searchbglarge),
            "icon",
            modifier = Modifier
                .size(200.dp)
        )
        Text("Search for a city to get started",
            color = Color(0xFFFFFFFF)
        )
    }
}

@Composable
fun WeatherInfo(cityWeather: CityWeather) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(R.drawable.ic_action_location),
                "icon"
            )
            Text(
                cityWeather.name,
                color = Color(0xFFFFFFFF)
            )
        }
        Row {
            Column {
                Text(
                    cityWeather.weather,
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp
                )
                Text(
                    "${cityWeather.tempCelsius}°C",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
            }
            Column {
                Image(
                    painter = painterResource(),
                    "icon",
                    modifier = Modifier
                        .size(150.dp)
                )
            }
        }
        Column {
            Row {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .width(150.dp)
                        .background(Color(0x40E9E9E9))
                        .padding(2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.icon_humidity),
                        "icon"
                    )
                    Text(
                        "HUMIDITY",
                        color = Color(0xFFFFFFFF)
                    )
                    Text(
                        "${cityWeather.humidity}%",
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .width(150.dp)
                        .background(Color(0x40E9E9E9))
                        .padding(2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.icon_wind),
                        "icon"
                    )
                    Text(
                        "WIND",
                        color = Color(0xFFFFFFFF)
                    )
                    Text(
                        "${cityWeather.windKMH}km/h",
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .width(150.dp)
                        .background(Color(0x40E9E9E9))
                        .padding(2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.icon_feels_like),
                        "icon"
                    )
                    Text(
                        "FEELS LIKE",
                        color = Color(0xFFFFFFFF)
                    )
                    Text(
                        "${cityWeather.feltTempCelsius}%",
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Row {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .width(150.dp)
                        .background(Color(0x40E9E9E9))
                        .padding(2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.vector_2),
                        "icon"
                    )
                    Text(
                        "RAIN FALL",
                        color = Color(0xFFFFFFFF)
                    )
                    Text(
                        "${cityWeather.rain}%",
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .width(150.dp)
                        .background(Color(0x40E9E9E9))
                        .padding(2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.devices),
                        "icon"
                    )
                    Text(
                        "PRESSURE",
                        color = Color(0xFFFFFFFF)
                    )
                    Text(
                        "${cityWeather.pressure}hPa",
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .width(150.dp)
                        .background(Color(0x40E9E9E9))
                        .padding(2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.cloud),
                        "icon"
                    )
                    Text(
                        "CLOUDS",
                        color = Color(0xFFFFFFFF)
                    )
                    Text(
                        "${cityWeather.clouds}%",
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painter = painterResource(R.drawable.vector),
                    "icon"
                )
                Text(
                    "SUNRISE",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "${cityWeather.sunRiseHour}:${cityWeather.sunRiseMin}",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painter = painterResource(R.drawable.vector_21png),
                    "icon"
                )
                Text(
                    "SUNSET",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "${cityWeather.sunSetHour}:${cityWeather.sunSetMin}",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun Error(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_action_error),
            "icon",
            modifier = Modifier
                .size(200.dp)
        )
        Text("Oops! Something went wrong",
            color = Color(0xFFFFFFFF),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text("HTTP 404 Not Found",
            color = Color(0xFFFFFFFF)
        )
    }
}

@Composable
fun MainView(
    searchWeather: () -> Unit = {}
) {
    Box{
        Image(
            painter = painterResource(R.drawable.weather___home_2),
            "bg",
            modifier = Modifier
                .fillMaxSize()
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            TextField(
                value = "",
                onValueChange = {},
                label = {Text("Enter City Name")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "search",
                        tint = Color(0xFF000000)
                    )
                },
                modifier = Modifier
                    .clip(RoundedCornerShape(18.dp))
            )
            TextButton(onClick = searchWeather) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .background(Color(0xFFE9E9E9))
                        .height(55.dp)
                        .padding(2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_action_search),
                        "search",
                    )
                    Text("Search")
                }
            }
        }
        Neutral()
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    WeatherTheme {
        MainView()
    }
}