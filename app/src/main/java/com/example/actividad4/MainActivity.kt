package com.example.actividad4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.actividad4.ui.theme.Actividad4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val operacionSeleccionada = intent.getStringExtra("operacionSeleccionada")




        setContent {
            Actividad4Theme {

                MyApp(operacionSeleccionada = operacionSeleccionada)
            }
        }
    }
}

@Composable
fun MyApp(operacionSeleccionada: String?) {
    var currentScreen by remember { mutableStateOf("bienvenida") }

    when (currentScreen) {
        "bienvenida" -> Bienvenida(onNavigateToDescription = { currentScreen = "description" })
        "description" -> Description(onNavigateToCalculadora = { currentScreen = "calculadora" })

        "calculadora" -> Calculadora(operacionSeleccionada = operacionSeleccionada)
    }
}
