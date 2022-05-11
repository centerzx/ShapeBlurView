package net.center.blurview.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*
import net.center.blurview.ShapeBlurView
import net.center.blurview.enu.BlurCorner
import net.center.blurview.enu.BlurMode

/**
 * Created by center
 * 2021-12-06.
 */
class TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
//        blurview?.refreshView(
//            ShapeBlurView.build().setBlurMode(BlurMode.MODE_RECTANGLE)
//                .setCornerRadius(BlurCorner.TOP_LEFT, 50f).setBorderWidth(10f)
//                .setBorderColor(
//                    R.color.teal_200
//                )
//        )
    }


}