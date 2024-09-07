package com.example.actividad4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.actividad4.ui.theme.Actividad4Theme

class CalculadoraActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val operacionSeleccionada = intent.getStringExtra("operacionSeleccionada")

        setContent {
            Actividad4Theme {

                Calculadora(operacionSeleccionada)
            }
        }
    }
}
