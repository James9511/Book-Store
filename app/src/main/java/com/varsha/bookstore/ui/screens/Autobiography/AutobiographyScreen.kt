package com.varsha.bookstore.ui.theme.screens.Autobiography


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
fun AutobiographyScreens(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Autobiography section", color = Color.White) }, Modifier.background(color = Color.Gray))
        //Box
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "The white Maasai ",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "Autobiography section",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White

                )
                Text(
                    text = "Read more about your legends...",
                    color = Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        //End of box
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
                                painter = painterResource(id = R.drawable.jomo),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Jomo Kenyatta", fontSize = 20.sp)
                        Text(text = "Ksh 650", fontSize = 20.sp, color = Color.LightGray)
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
                                painter = painterResource(id = R.drawable.jaramogi),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Jaramogi Oginga", fontSize = 20.sp)
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
                                painter = painterResource(id = R.drawable.wangari),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Wangari Mathai", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.Black)
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
                                painter = painterResource(id = R.drawable.kagia),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Shirt 1", fontSize = 20.sp)
                        Text(text = "Ksh 680", fontSize = 20.sp, color = Color.Black)
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
                                painter = painterResource(id = R.drawable.dedan),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Dedan Kimathi", fontSize = 20.sp)
                        Text(text = "Ksh 725", fontSize = 20.sp, color = Color.Black)
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
                                painter = painterResource(id = R.drawable.raila),
                                contentDescription = "Shirt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Raila Odinga", fontSize = 20.sp)
                        Text(text = "Ksh 599", fontSize = 20.sp, color = Color.Black)
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
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AutobiographyScreensPreview(){
    BookStoreTheme {
        AutobiographyScreens(rememberNavController())
    }
}