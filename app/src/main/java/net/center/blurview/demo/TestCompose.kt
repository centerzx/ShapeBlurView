package net.center.blurview.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.center.blurview.ShapeBlurView
import net.center.blurview.compose.ShapeBlurView

/**
 * @author: orangeboy
 * @createTime: 2022/10/31 19:25
 * @description:
 */
@Preview(showBackground = true)
@Composable
fun BlurComposeExample() {
    Box {
        Image(painter = painterResource(id = R.mipmap.test), contentDescription = null)
        ShapeBlurView(
            modifier = Modifier.height(100.dp).width(100.dp).offset(x = 30.dp, y = 30.dp),
            config = ShapeBlurView.Config().apply {
                this.cornerRadiusOverride = 50f
            })
    }
}