package br.com.paulohss.todolistapp.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.paulohss.todolistapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun toDoList(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Lista de Tarefas", fontSize = 18.sp, fontWeight = FontWeight.Bold
                    )
                }

                )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate("SaveToDo")
            }) {
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.baseline_add_24), contentDescription = "Icon Add To Do")
            }
        }
    ) {

    }
}