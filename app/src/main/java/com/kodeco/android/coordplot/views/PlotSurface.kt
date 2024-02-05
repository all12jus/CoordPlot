package com.kodeco.android.coordplot.views

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun PlotSurface() {

    val configuration = LocalConfiguration.current
    val isLandscape = configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

    var xPercent by rememberSaveable {
        mutableFloatStateOf(0.5f)
    }

    var yPercent by rememberSaveable {
        mutableFloatStateOf(0.5f)
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White,
    ) {

        // May work on this version in the future, make it not require labels.

        val customSliderColors = SliderDefaults.colors(
            thumbColor = Color.Red, // Color of the thumb
            activeTrackColor = Color.Red, // Color of the active track
            inactiveTrackColor = Color.Green.copy(alpha = 0.3f) // Color of the inactive track
        )


        if (isLandscape) {

            Row (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {


                Map(xPercent = xPercent, yPercent = yPercent)


                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    MapSlider(
                        label = "X Axis:",
                        isLandscape = isLandscape,
                        value = xPercent,
                        setValue = { xPercent = it},
                        colors = customSliderColors
                    )

                    MapSlider(
                        label = "Y Axis:",
                        isLandscape = isLandscape,
                        value = yPercent,
                        setValue = { yPercent = it},
                        colors = customSliderColors
                    )
                }

            }

        }
        else {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Map(xPercent = xPercent, yPercent = yPercent)

                MapSlider(
                    label = "X Axis:",
                    isLandscape = isLandscape,
                    value = xPercent,
                    setValue = { xPercent = it},
                    colors = customSliderColors
                )

                MapSlider(
                    label = "Y Axis:",
                    isLandscape = isLandscape,
                    value = yPercent,
                    setValue = { yPercent = it},
                    colors = customSliderColors
                )


            }
        }




        //  This should include a Column composable that
        //  includes a Map, and two MapSlider composables
        //  (one slider for each axis).
    }

}

@Preview(showBackground = true)
@Composable
fun PlotSurfacePreview() {
    MyApplicationTheme {
        PlotSurface()
    }
}
