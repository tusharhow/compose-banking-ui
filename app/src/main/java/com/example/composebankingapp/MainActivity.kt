package com.example.composebankingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.example.composebankingapp.src.views.HomePage

import com.example.composebankingapp.ui.theme.ComposeBankingAppTheme
import com.example.composebankingapp.ui.theme.kPrimaryColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBankingAppTheme{

                Surface(

                    color =  kPrimaryColor,
                ) {

                   HomePage()
                }
            }
        }
    }
}

