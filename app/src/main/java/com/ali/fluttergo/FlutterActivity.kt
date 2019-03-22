package com.ali.fluttergo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout
import io.flutter.facade.Flutter


/**
 * Author: xiaojia.dxj
 * Date: 2019/3/21 15:42
 * Email: xiaojia.dxj@alibaba-inc.com
 * LastUpdateTime: 2019/3/21 15:42
 * LastUpdateBy: xiaojia.dxj
 *
 * Describle:
 */
class FlutterActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //这个填充的view可以作为flutter真正的view被填充和加载前展示出来 也就是我们启动时候看到的那个瞬间黑屏
        setContentView(R.layout.activity_flutter)
//        val flutterView=Flutter.createView(this@FlutterActivity,lifecycle,"route")
//        val layout=FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
//            FrameLayout.LayoutParams.MATCH_PARENT)
//        addContentView(flutterView,layout)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_flutter_view, Flutter.createFragment("route"))
        fragmentTransaction.commit()
    }

}