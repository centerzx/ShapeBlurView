package net.center.blurview.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import net.center.blurview.ShapeBlurView

/**
 * @author: orangeboy
 * @createTime: 2022/10/31 19:12
 * @description:
 */
@Composable
fun ShapeBlurView(
    modifier: Modifier = Modifier,
    config: ShapeBlurView.Config = ShapeBlurView.Config()) {
    AndroidView(
        factory = { context ->
            ShapeBlurView(context, config)
        },
        modifier = modifier
    )
}