package com.kodeco.android.coordplot.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun MapSlider(label: String, isLandscape: Boolean, value: Float, setValue: (Float) -> Unit, colors: SliderColors) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = label)
        Slider(value = value, onValueChange = { setValue(it) }, valueRange = 0f..1f,  colors = colors,)
    }

}


@Preview(showBackground = true)
@Composable
fun MapSliderPreview() {
    MyApplicationTheme {
        MapSlider(label= "Label", isLandscape = false, value = 0.5f, setValue = {}, colors = SliderDefaults.colors(
            thumbColor = Color.Red, // Color of the thumb
            activeTrackColor = Color.Red, // Color of the active track
            inactiveTrackColor = Color.Green.copy(alpha = 0.3f) // Color of the inactive track
        ))
    }
}
