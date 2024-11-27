package com.example.onefootball

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onefootball.ui.theme.ONEFOOTBALLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ONEFOOTBALLTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Black)) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (modifier.fillMaxSize()){
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)){
            Text("ONEFOOTBALL",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .weight(1f))

            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Buscar",
                tint = Color.White
            )

            Image(
                painter = painterResource(R.drawable.madrid),
                contentDescription = "Buscar",
                modifier = Modifier
                    .padding(start = 20.dp)
            )
        }
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            item {
                Column(modifier = Modifier.padding(end = 20.dp)) {
                    Box(modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(color = Color.DarkGray)
                        .border(2.dp, Color.Blue, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.fuego),
                            contentDescription = "Historias",
                            modifier = Modifier
                                .align(Alignment.Center)
                        )
                    }
                    Text(
                        text = "Historias",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.width(15.dp))
            }

            item {
                Box(modifier = Modifier
                    .size(90.dp)
                    .background(color = Color.DarkGray)) {
                    Image(
                        painter = painterResource(R.drawable.fantasy),
                        contentDescription = "Fantasy",
                        modifier = Modifier
                            .size(60.dp)
                            .align(Alignment.TopCenter)
                            .padding(top = 10.dp, bottom = 15.dp)
                    )

                    Text("LaLiga",
                        color = Color.White,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(top = 30.dp))

                    Text("Resumen",
                        color = Color.White,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(top = 60.dp))
                }
            }

            item {
                Spacer(modifier = Modifier.width(15.dp))
            }

            item {
                boxPartido(R.drawable.granada, R.drawable.cadiz, "3 - 2")
            }

            item {
                Spacer(modifier = Modifier.width(15.dp))
            }

            item {
                boxPartido(R.drawable.alnasar, R.drawable.alhilal, "5 - 1")
            }

            item {
                Spacer(modifier = Modifier.width(15.dp))
            }

            item {
                boxPartido(R.drawable.barsa, R.drawable.celta, "2 - 2")
            }
        }

            Text("Tu equipo",
            color = Color.White,
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp, bottom = 5.dp))
            Column (modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()) {
                Box(modifier = Modifier
                    .background(color = Color.Gray)) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.fantasy),
                            contentDescription = "Fantasy",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(20.dp)
                        )

                        Text(
                            "LaLiga - Jornada 14",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .padding(top = 10.dp)
                        )
                    }

                    Row (modifier = Modifier
                        .padding(top = 30.dp)){
                        Column(
                            modifier = Modifier
                                .padding(top = 30.dp, start = 40.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.madrid),
                                contentDescription = "madrid",
                                modifier = Modifier
                                    .size(40.dp)
                            )
                            Text(
                                "Madrid",
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }

                        Column(
                            modifier = Modifier
                                .padding(top = 40.dp, start = 55.dp)
                        ) {
                            Text(
                                "06:28:30",
                                color = Color.White,
                                fontSize = 20.sp
                            )

                            Text(
                                "21:00",
                                color = Color.White,
                                fontSize = 10.sp,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }

                        Column(
                            modifier = Modifier
                                .padding(top = 34.dp, start = 50.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.iconobarsa),
                                contentDescription = "barsa",
                                modifier = Modifier
                                    .padding(start = 5.dp)
                                    .size(38.dp)
                            )

                            Text(
                                "Barcelona",
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.size(20.dp))

                    Box(
                        modifier = Modifier
                            .padding(top = 120.dp)
                            .padding(10.dp)
                            .fillMaxWidth()
                            .background(color = Color.Black)
                    ) {
                        Row {
                            Divider(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .background(color = Color.Gray)
                                    .height(1.dp)
                                    .weight(1.5f)
                            )

                            Spacer(modifier = Modifier.size(20.dp))

                            Text("Who will win?",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .weight(1f))

                            Spacer(modifier = Modifier.size(20.dp))

                            Divider(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .background(color = Color.Gray)
                                    .height(1.dp)
                                    .width(30.dp)
                                    .weight(0.8f)
                            )

                            Spacer(modifier = Modifier.size(20.dp))

                            Text("bet365",
                                fontSize = 8.sp,
                                modifier = Modifier
                                    .weight(0.5f))
                        }

                        Row (modifier = Modifier
                            .padding(top = 40.dp)
                            .padding(start = 60.dp)){
                            Text("Real Madrid",
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .border(
                                        width = (3.dp),
                                        color = Color.Red,
                                        shape = RoundedCornerShape(
                                            topStart = 50.dp,
                                            bottomStart = 50.dp,
                                            topEnd = 0.dp,
                                            bottomEnd = 0.dp
                                        )
                                    )
                                    .padding(10.dp)
                                )
                            Text("Draw",
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .border(
                                        width = (3.dp),
                                        color = Color.Gray,
                                        shape = RoundedCornerShape(
                                            topStart = 0.dp,
                                            bottomStart = 0.dp,
                                            topEnd = 0.dp,
                                            bottomEnd = 0.dp
                                        )
                                    )
                                    .padding(10.dp)
                            )
                            Text("Barcelona",
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .border(
                                        width = (3.dp),
                                        color = Color.White,
                                        shape = RoundedCornerShape(
                                            topStart = 0.dp,
                                            bottomStart = 0.dp,
                                            topEnd = 50.dp,
                                            bottomEnd = 50.dp
                                        )
                                    )
                                    .padding(10.dp)
                            )
                        }
                        Column (modifier = Modifier
                            .padding(start = 110.dp)
                            .padding(top = 95.dp)){
                            Text("62.657 fans have voted",
                                fontSize = 12.sp)
                        }
                    }
                }
            }
            Row (modifier = Modifier
                .padding(top = 210.dp)
                .padding(20.dp)
                .fillMaxWidth()){
                Column (horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(8.dp)){
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Buscar",
                        tint = Color.White
                    )
                    Text("INICIO",
                        fontSize = 12.sp)
                }

                Spacer(modifier = Modifier.size(40.dp))

                Column (horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(8.dp)){
                    Icon(
                        imageVector = Icons.Filled.DateRange,
                        contentDescription = "PARTIDOS",
                        tint = Color.White
                    )
                    Text("PARTIDOS",
                        fontSize = 12.sp)
                }

                Spacer(modifier = Modifier.size(40.dp))

                Column (horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(8.dp)){
                    Icon(
                        imageVector = Icons.Filled.PlayArrow,
                        contentDescription = "TV",
                        tint = Color.White
                    )
                    Text("TV",
                        fontSize = 12.sp)
                }

                Spacer(modifier = Modifier.size(40.dp))

                Column (horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(8.dp)){
                    Icon(
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "PERFIL",
                        tint = Color.White
                    )
                    Text("PERFIL",
                        fontSize = 12.sp)
                }
            }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ONEFOOTBALLTheme {
        Greeting("Android")
    }
}

@Composable
fun boxPartido(image1: Int, image2: Int, text1: String) {
    Box(
        modifier = Modifier
            .size(90.dp)
            .background(color = Color.DarkGray)
    ) {
        Image(
            painter = painterResource(id = image1),
            contentDescription = "Image 1",
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.TopStart)
                .padding(top = 10.dp, bottom = 15.dp)
        )

        Image(
            painter = painterResource(id = image2),
            contentDescription = "Image 2",
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.TopEnd)
                .padding(top = 10.dp, bottom = 15.dp)
        )

        Text(
            text = text1,
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 30.dp)
        )

        Text(
            text = "Resumen",
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 60.dp)
        )
    }
}