package com.example.dromtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dromtest.ui.theme.DromTestTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DromTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Question()
                }
            }
        }
    }
}

@Composable
fun Question(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.q_1),
            contentDescription = "text",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            "Сколько полос для движения имеет данная дорога?",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Column( verticalArrangement = Arrangement.spacedBy(12.dp) ) {
            Box(
                Modifier
                    .wrapContentSize()
                    .fillMaxWidth()
                    .background(
                        color = Color(0x220000FF)
                    )
                    .clickable { println("1. Две") }.padding(10.dp)) {
                Text("1. Две", fontSize = 16.sp, modifier = Modifier.align(Alignment.CenterStart))
            }
            Box(
                Modifier
                    .wrapContentSize()
                    .fillMaxWidth()
                    .background(
                        color = Color(0x220000FF)
                    )
                    .clickable { println("1. Четыре") }.padding(10.dp)) {
                Text("2. Четыре", fontSize = 16.sp, modifier = Modifier.align(Alignment.CenterStart))
            }
            Box(
                Modifier
                    .wrapContentSize()
                    .fillMaxWidth()
                    .background(
                        color = Color(0x220000FF)
                    )
                    .clickable { println("3. Пять") }.padding(10.dp)) {
                Text("3. Пять", fontSize = 16.sp, modifier = Modifier.align(Alignment.CenterStart))
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun QuestionPreview() {
    Question()
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    DromTestTheme {
//        Greeting("Android")
//    }
//}