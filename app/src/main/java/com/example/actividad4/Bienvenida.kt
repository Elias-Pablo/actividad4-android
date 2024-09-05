package com.example.actividad4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun Bienvenida(onNavigateToDescription: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.face),
                contentDescription = "Background Image",
                modifier = Modifier
                    .size(150.dp)

            )
            Text(
                text = "Bienvenido a la calculadora",
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { onNavigateToDescription() }) {
                Text(text = "Ir a la Descripción")
            }
        }
    }
}
