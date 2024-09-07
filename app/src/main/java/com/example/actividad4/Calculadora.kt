package com.example.actividad4

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import org.mariuszgromada.math.mxparser.Expression

@Composable
fun Calculadora(operacionSeleccionada: String? = null) {
    var resultado = remember { mutableListOf<String>() }
    var contexto = LocalContext.current
    var input1 by remember { mutableStateOf(operacionSeleccionada ?: "") }  // Si hay operación, la usamos
    var result by remember { mutableStateOf("") }
    var operation by remember { mutableStateOf<String?>(null) }
    var isOperatorPressed by remember { mutableStateOf(false) }



    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                TextField(value = input1, onValueChange = { input1 = it })
            }
            Spacer(modifier = Modifier.height(8.dp))

            Row {
                TextField(value = result, onValueChange = { result = it })
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.DarkGray,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        input1 = ""

                        result = ""
                        operation = null
                        isOperatorPressed = false
                    }) {
                    Text(text = "AC")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.DarkGray,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        if (!isOperatorPressed && input1.isNotEmpty()) {
                            operation = "+/-"
                            input1 = "-$input1"
                            isOperatorPressed = false
                        }
                    }) {
                    Text(text = "+/-")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.DarkGray,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        if (!isOperatorPressed && input1.isNotEmpty()) {
                            operation = ""
                            input1 += "%"
                            isOperatorPressed = false
                        }
                    }) {
                    Text(text = "%")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Yellow,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        if (!isOperatorPressed && input1.isNotEmpty()) {
                            operation = "/"
                            input1 += " / "
                            isOperatorPressed = true
                        }
                    }) {
                    Text(text = "/")
                }
            }


            Row {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "7"; isOperatorPressed = false }) {
                    Text(text = "7")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "8"; isOperatorPressed = false }) {
                    Text(text = "8")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "9"; isOperatorPressed = false }) {
                    Text(text = "9")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Yellow,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        if (!isOperatorPressed && input1.isNotEmpty()) {
                            operation = "*"
                            input1 += " x "
                            isOperatorPressed = true
                        }
                    }) {
                    Text(text = "*")
                }
            }


            Row {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "4"; isOperatorPressed = false }) {
                    Text(text = "4")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "5"; isOperatorPressed = false }) {
                    Text(text = "5")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "6"; isOperatorPressed = false }) {
                    Text(text = "6")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Yellow,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        if (!isOperatorPressed && input1.isNotEmpty()) {
                            operation = "-"
                            input1 += " - "
                            isOperatorPressed = true
                        }
                    }) {
                    Text(text = "-")
                }
            }
            Row {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "1";isOperatorPressed = false }) {
                    Text(text = "1")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "2"; isOperatorPressed = false }) {
                    Text(text = "2")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "3"; isOperatorPressed = false }) {
                    Text(text = "3")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Yellow,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        if (!isOperatorPressed && input1.isNotEmpty()) {
                            operation = "+"
                            input1 += " + "
                            isOperatorPressed = true
                        }
                    }) {

                    Text(text = "+")
                }
            }


            // Última fila
            Row {

                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "."; isOperatorPressed = false }) {
                    Text(text = ".")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = { input1 += "0"; isOperatorPressed = false }) {
                    Text(text = "0")
                }
                Button(
                    modifier = Modifier
                        .weight(2f)
                        .padding(4.dp)
                        .height(64.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Yellow,
                        contentColor = Color.Black
                    ),
                    onClick = {

                        val expression = Expression(input1.replace("x", "*").replace("÷", "/"))
                        result = expression.calculate().toString()
                        resultado.add("$input1 = $result")

                    }) {
                    Text(text = "=")
                }
            }
            Row {
                Button(
                    onClick = {

                        val llamarRegistro = Intent(contexto, MainActivity2::class.java).apply {
                            putStringArrayListExtra("historial", ArrayList(resultado))
                        }
                        contexto.startActivity(llamarRegistro)
                    }) {
                    Text(text = "Ir al Historial")
                }
            }




        }
    }
}
