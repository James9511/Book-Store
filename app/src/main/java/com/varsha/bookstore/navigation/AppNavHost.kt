package com.varsha.bookstore.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.varsha.bookstore.ui.theme.screens.Autobiography.AutobiographyScreens
import com.varsha.bookstore.ui.theme.screens.comic.ComicScreens
import com.varsha.bookstore.ui.theme.screens.dashboard.DashboardScreens
import com.varsha.bookstore.ui.theme.screens.home.HomeScreen
import com.varsha.bookstore.ui.theme.screens.login.LoginScreen
import com.varsha.bookstore.ui.theme.screens.motivation.MotivationScreens
import com.varsha.bookstore.ui.theme.screens.novel.NovelScreens
import com.varsha.bookstore.ui.theme.screens.products.AddProductsScreen
import com.varsha.bookstore.ui.theme.screens.products.ViewProductsScreen
import com.varsha.bookstore.ui.theme.screens.signup.SignupScreen
import com.varsha.bookstore.ui.theme.screens.studying.StudyingScreens

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = LOGIN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }

        composable(AUTOBIOGRAPHY_URL){
            AutobiographyScreens(navController = navController)
        }

        composable(COMIC_URL){
            ComicScreens(navController = navController)
        }

        composable(DASHBOARD_URL){
            DashboardScreens(navController = navController)
        }
        composable(MOTIVATION_URL){
            MotivationScreens(navController = navController)
        }
        composable(NOVEL_URL){
            NovelScreens(navController = navController)
        }
        composable(STUDY_URL){
            StudyingScreens(navController = navController)
        }
    }
}