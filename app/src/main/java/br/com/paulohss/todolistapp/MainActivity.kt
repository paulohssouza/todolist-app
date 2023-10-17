package br.com.paulohss.todolistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.paulohss.todolistapp.view.saveToDo
import br.com.paulohss.todolistapp.view.toDoList
import com.example.compose.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "ToDoList") {
                    composable(
                        route = "ToDoList"
                    ) {
                        toDoList(navController)
                    }

                    composable(
                        route = "SaveToDo"
                    ) {
                        saveToDo(navController)
                    }
                }
            }
        }
    }
}