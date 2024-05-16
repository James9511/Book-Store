package com.varsha.bookstore.ui.theme.screens.studying

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
import com.varsha.bookstore.ui.theme.BookStoreTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudyingScreens(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Autobiography section", color = Color.White) }, Modifier.background(color = Color.Gray))
        //Box
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(210.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Image(
                painter = painterResource(id = R.drawable.novels),
                contentDescription = "The white Maasai ",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "Learning Essentials",
                    fontSize = 39.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    color = Color.White

                )
                Text(
                    text = "In need of Revision Materials?",
                    color = Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(10.dp))

            }

        }
        //End of box
        Text(
            text = "We have Revision Materials ranging from",
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(10.dp),
        ){
            //Row 1
            Row (modifier = Modifier.fillMaxWidth()){
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.mf),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Made Familiars", fontSize = 20.sp)
                        Text(text = "Ksh 700", fontSize = 20.sp, color = Color.Black)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0723995368".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.gt),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Golden Tips", fontSize = 20.sp)
                        Text(text = "Ksh 500", fontSize = 20.sp, color = Color.Black)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0723995368".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(6.dp))
            //Row 1
            Row (modifier = Modifier.fillMaxWidth()){
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.ach),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Achievers", fontSize = 20.sp)
                        Text(text = "Ksh 720", fontSize = 20.sp, color = Color.Black)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0791923440".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(6.dp))
                Card {
                    Column (modifier = Modifier.padding(5.dp)){
                        Box(
                            modifier = Modifier.size(width = 180.dp, height = 200.dp),

                            ){
                            Image(
                                painter = painterResource(id = R.drawable.mockingbird),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "The Mockingird", fontSize = 20.sp)
                        Text(text = "Ksh 770", fontSize = 20.sp, color = Color.Black)
                        Row (Modifier.padding(2.dp)) {
                            OutlinedButton(
                                onClick = {   val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "PAY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(36.dp))
                            OutlinedButton(
                                onClick = {
                                    val callIntent= Intent(Intent.ACTION_DIAL)
                                    callIntent.data="tel:0723995368".toUri()
                                    mContext.startActivity(callIntent)
                                },
                                shape = RoundedCornerShape(5.dp),
                                border = BorderStroke(1.dp, Color.Black),
                            ) {
                                Text(text = "Call", color = Color.Black)
                            }
                        }
                    }
                }
            }
            //End of row 1
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StudyingScreensPreview(){
    BookStoreTheme {
        StudyingScreens(rememberNavController())
    }

}