package com.kodeco.android.coordplot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< Updated upstream
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
=======
>>>>>>> Stashed changes
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme
import com.kodeco.android.coordplot.views.PlotSurface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                PlotSurface()
//                Image(
//                    modifier = Modifier.size(36.dp)
////                        .offset(xOffset.dp, yOffset.dp)
//                    ,
//                    painter = painterResource(id = R.drawable.game_assets_18_11),
//                    contentDescription = stringResource(R.string.plot_point)
//                )
            }
        }
    }
}

<<<<<<< Updated upstream
@Composable
fun PlotSurface() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        // TODO Build out the plot surface
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

@Composable
fun Map(xPercent: Float, yPercent: Float, modifier: Modifier = Modifier) {
    // TODO fill out the square map here.
    //  Create a Box composable with a size of 300.dp
    //  and then create an inner Box composable
    //  with a clip shape of CircleShape.
}

@Preview(showBackground = true)
@Composable
fun MapPreview() {
    MyApplicationTheme {
        Map(xPercent = 0.5f, yPercent = 0.5f)
    }
}
=======


>>>>>>> Stashed changes
