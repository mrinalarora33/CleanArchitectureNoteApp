package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.focus.focusModifier
import java.lang.reflect.Modifier

@Composable
fun  DefultRadioButton(
    text:String,
    checked: Boolean,
    onSelect:()-> Unit,
    modifier: Modifier =Modifier
){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selected,
            onClick = onSelect,
            )
    }
}