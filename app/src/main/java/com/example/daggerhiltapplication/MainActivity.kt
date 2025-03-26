package com.example.daggerhiltapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.daggerhiltapplication.mvvm.MyViewModel
import com.example.daggerhiltapplication.ui.theme.DaggerHiltApplicationTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaggerHiltApplicationTheme {
                val viewModel = hiltViewModel<MyViewModel>()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    viewModel.makeCoffeeRun()
                }
            }
        }
    }
}

