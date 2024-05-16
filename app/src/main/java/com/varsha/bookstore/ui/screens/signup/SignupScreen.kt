package com.varsha.bookstore.ui.theme.screens.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.varsha.bookstore.data.AuthViewModel
import com.varsha.bookstore.navigation.HOME_URL
import com.varsha.bookstore.navigation.LOGIN_URL
import com.varsha.bookstore.ui.theme.BookStoreTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Signup With Us  Here",
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(30.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = { Text(text = "Enter name")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Enter your email")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Enter your password")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Text(text = "You don't have an account?")

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            authViewModel.signup(name, email, password)
            navController.navigate(HOME_URL)
        }) {
            Text(text = "Register")
        }

        Spacer(modifier = Modifier.height(30.dp))



        Button(onClick = {
            navController.navigate(LOGIN_URL)
        }) {
            Text(text = "Login instead")
        }

    }
}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    BookStoreTheme {
        SignupScreen(navController = rememberNavController())
    }
}