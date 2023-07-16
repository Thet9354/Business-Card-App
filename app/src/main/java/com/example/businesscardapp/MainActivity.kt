package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Intro()
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        ) {
            Details()
        }
    }
}




@Composable
fun Intro() {
    val image = painterResource(id = R.drawable.isb_6894)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.height(300.dp)
            )

            Text(
                text = "Thet Pine",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )

            Text(
                text = "Android Developer",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}



@Composable
fun Details(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val phoneIcon = Icons.Rounded.Phone
                Icon(
                    imageVector = phoneIcon,
                    contentDescription = "Phone Icon"
                )
                Spacer(modifier = Modifier.width(8.dp)) // Adjust the spacing as desired
                Text(text = "+65 93542856")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                val webIcon = Icons.Rounded.Info
                Icon(
                    imageVector = webIcon,
                    contentDescription = "Web Icon"
                )
                Spacer(modifier = Modifier.width(8.dp)) // Adjust the spacing as desired
                Text(text = "https://github.com/Thet9354")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                val emailIcon = Icons.Rounded.Email
                Icon(
                    imageVector = emailIcon,
                    contentDescription = "Email Icon"
                )
                Spacer(modifier = Modifier.width(8.dp)) // Adjust the spacing as desired
                Text(text = "thetpine254@gmail.com")
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}
