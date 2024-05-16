package com.varsha.bookstore.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.varsha.bookstore.navigation.ADD_PRODUCTS_URL
import com.varsha.bookstore.navigation.DASHBOARD_URL
import com.varsha.bookstore.navigation.VIEW_PRODUCTS_URL
import com.varsha.bookstore.ui.theme.BookStoreTheme

@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "BookStore App",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ADD_PRODUCTS_URL)
        }) {
            Text(text = "Add Products",
                fontWeight = FontWeight.ExtraBold,
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(VIEW_PRODUCTS_URL)
        }) {
            Text(text = "View Products",
                fontWeight = FontWeight.ExtraBold,
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(DASHBOARD_URL    )
        }) {
            Text(text = "Dashboard",
                fontWeight = FontWeight.ExtraBold,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    BookStoreTheme {
        HomeScreen(navController = rememberNavController())
    }
}