package com.brunodles.oisaldo

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.telephony.TelephonyManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val telephony = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        telephony.sendUssdRequest("*144#", object : TelephonyManager.UssdResponseCallback() {

        }, Handler())
    }
}
