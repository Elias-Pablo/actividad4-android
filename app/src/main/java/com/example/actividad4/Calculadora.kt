package com.example.actividad4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Calculadora() {
    Box (

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Column (

        ) {
            Row {
                TextField(value = "", onValueChange ={} )
            }
            Spacer (modifier = Modifier.height(8.dp))
            Row {
                TextField(value = "", onValueChange ={} )
            }
        }
    }
}

fun Sumar(a: Int, b: Int): Int {
    return a + b
}