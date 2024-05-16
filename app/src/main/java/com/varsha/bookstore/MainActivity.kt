package com.varsha.bookstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.varsha.bookstore.component.bookdetail.BookDetailScreen
import com.varsha.bookstore.component.booklist.HomeScreen
import com.varsha.bookstore.navigation.AppNavHost
import com.varsha.bookstore.ui.navigation.Screen
import com.varsha.bookstore.ui.theme.BookStoreTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookStoreTheme {
                val navController = rememberNavController()
                // Navigation component for handling the screens navigation
                NavigationComponent(
                    navController = navController,
                )
            }
        }
    }
}

@Composable
fun NavigationComponent(
    navController: NavHostController,
) {


    AppNavHost()
}
