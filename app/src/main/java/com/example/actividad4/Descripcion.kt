package com.example.actividad4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Description(onNavigateToCalculadora: () -> Unit) {
    Surface(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(modifier= Modifier.padding(50.dp),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center) {
            Text(text = "Funciones de la Calculadora")

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Esta calculadora te permite realizar las siguientes operaciones:")

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "- Suma: Añade dos o más números.")
            Text(text = "- Resta: Resta un número de otro.")
            Text(text = "- Multiplicación: Multiplica dos o más números.")
            Text(text = "- División: Divide un número por otro.")
            Text(text = "- Otras funciones matemáticas avanzadas para cálculos específicos.")

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = onNavigateToCalculadora) {
                Text("Ir a la Calculadora")
            }
        }
    }
}
