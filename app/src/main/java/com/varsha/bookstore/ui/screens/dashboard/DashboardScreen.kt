package com.varsha.bookstore.ui.theme.screens.dashboard



import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.varsha.bookstore.R
import com.varsha.bookstore.navigation.AUTOBIOGRAPHY_URL
import com.varsha.bookstore.navigation.COMIC_URL
import com.varsha.bookstore.navigation.NOVEL_URL
import com.varsha.bookstore.navigation.STUDY_URL
import com.varsha.bookstore.ui.theme.BookStoreTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreens(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "", color = Color.White) },
            Modifier.background(color = Color.Gray)
        )
        //Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "The white Maasai ",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "Welcome to our bookstore",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White

                )
                Text(
                    text = "We have books ranging from...",
                    color = Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        //End of box
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(10.dp),
        ) {
            //Row 1
            Row(modifier = Modifier.fillMaxWidth()) {
                Card {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.jomo),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "AUTOBIOGRAPHIES", fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Row(Modifier.padding(2.dp)) {
                            Button(onClick = {
                                navController.navigate(AUTOBIOGRAPHY_URL)
                            }) {
                                Text(
                                    text = "View more",
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )
                            }
                            Spacer(modifier = Modifier.width(36.dp))

                        }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))
                Card {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.comic),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "COMICS", fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Row(Modifier.padding(2.dp)) {
                            Button(onClick = {
                                navController.navigate(COMIC_URL)
                            }) {
                                Text(
                                    text = "View more",
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )
                            }
                            Spacer(modifier = Modifier.width(36.dp))


                        }
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(6.dp))
              //Row 1
            Row(modifier = Modifier.fillMaxWidth()) {
                Card {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.mf),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "REVISION MATERIALS", fontSize = 18
                                .sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Row(Modifier.padding(2.dp)) {
                            Button(onClick = {
                                navController.navigate(STUDY_URL)
                            }) {
                                Text(
                                    text = "View more",
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )
                            }
                            Spacer(modifier = Modifier.width(36.dp))

                        }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))
                Card {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.novels),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "NOVELS", fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Row(Modifier.padding(2.dp)) {
                            Button(onClick = {
                                navController.navigate(NOVEL_URL)
                            }) {
                                Text(
                                    text = "View more",
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )
                            }
                            Spacer(modifier = Modifier.width(36.dp))


                        }
                    }
                }
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                Card {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.mf),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "REVISION MATERIALS", fontSize = 20.sp)
                        Row(Modifier.padding(2.dp)) {
                            Row(Modifier.padding(2.dp)) {
                                Button(onClick = {
                                    navController.navigate(STUDY_URL)
                                }) {
                                    Text(
                                        text = "View more",
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.Black
                                    )
                                }
                            }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))

                        }
                    }
                }
            }
            //End of row 1

}



@Preview(showBackground = true)
@Composable
fun DashboardScreensPreview(){
    BookStoreTheme {

        DashboardScreens(rememberNavController())
    }
}