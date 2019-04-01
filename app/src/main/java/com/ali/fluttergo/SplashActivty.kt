package com.ali.fluttergo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v4.os.HandlerCompat.postDelayed




/**
 * Author: xiaojia.dxj
 * Date: 2019/4/1 16:14
 * Email: xiaojia.dxj@alibaba-inc.com
 * LastUpdateTime: 2019/4/1 16:14
 * LastUpdateBy: xiaojia.dxj
 *
 * Describle:
 */
class SplashActivty:AppCompatActivity(){
    val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler.postDelayed({
            startActivity(Intent(this,FlutterActivity::class.java)) },
            1000)

    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}