package com.example.actividad4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.actividad4.ui.theme.Actividad4Theme
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividad4Theme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var currentScreen by remember { mutableStateOf("bienvenida") }

    when (currentScreen) {
        "bienvenida" -> Bienvenida(onNavigateToDescription = { currentScreen = "description" })
        "description" -> Description(onNavigateToCalculadora = { currentScreen = "calculadora" })
        "calculadora" -> Calculadora()
    }
}
