package com.kodeco.android.coordplot.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.R
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun Map(xPercent: Float, yPercent: Float, modifier: Modifier = Modifier) {
    //  Create a Box composable with a size of 300.dp
    //  and then create an inner Box composable
    //  with a clip shape of CircleShape.

    val xOffset  = (xPercent * 300 - 18)
    val yOffset = (yPercent * 300 - 18)

    Box {
        Box (
            modifier = modifier
                .size(300.dp)
                .background(Color.Green.copy(alpha = 0.25f))
        )

        Image(
            modifier = Modifier.size(36.dp).offset(xOffset.dp, yOffset.dp),
            painter = painterResource(id = R.drawable.game_assets_18_11),
            contentDescription = stringResource(R.string.plot_point)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun MapPreview() {
    MyApplicationTheme {
        Map(xPercent = 0.5f, yPercent = 0.5f)
    }
}