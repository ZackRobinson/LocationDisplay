package com.zackrobinson.latlongdisplay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LocationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val latTv = findViewById<TextView>(R.id.latTv)
        val longTv = findViewById<TextView>(R.id.longTv)
        val whereAmIBtn = findViewById<Button>(R.id.whereAmIBtn)

        whereAmIBtn.setOnClickListener{
            latTv.text = "41.751526"
            longTv.text = "87.960855"
        }
    }


}
