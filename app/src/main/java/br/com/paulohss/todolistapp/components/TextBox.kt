package br.com.paulohss.todolistapp.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun textBox(
    value: String
    onValueChange: ()
) {
    OutlinedTextField(
        value = value,
        onValueChange =
    )
}

@Composable
@Preview
private fun textBoxPreview() {

}