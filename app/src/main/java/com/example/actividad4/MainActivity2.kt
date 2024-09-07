package com.example.actividad4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val historial = intent.getStringArrayListExtra("historial")

        setContent {
            if (historial != null) {
                HistorialScreen(historial)
            } else {
                Text(text = "No hay historial disponible")
            }
        }
    }
}

@Composable
fun HistorialScreen(historial: List<String>) {
    var contexto = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Historial de Operaciones", modifier = Modifier.padding(bottom = 16.dp))


        historial.forEach { operacion ->
            Text(text = operacion, modifier = Modifier.padding(bottom = 8.dp))
        }
        Row {
            Button(onClick = {
                val volverCalculadora = Intent(contexto, MainActivity::class.java)
                contexto.startActivity(volverCalculadora)
            }) {
                Text(text = "Volver al Home")
            }
        }
    }

}
