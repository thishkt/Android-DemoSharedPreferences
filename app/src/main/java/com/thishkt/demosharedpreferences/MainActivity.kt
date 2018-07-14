package com.thishkt.demosharedpreferences

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG =javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharePref= getSharedPreferences("mydata", Context.MODE_PRIVATE)
        sharePref.edit().putBoolean("first_login",true).apply()
        sharePref.edit().putString("id","0123456789").apply()
        sharePref.edit().putInt("Score",100).apply()

        Log.d(TAG,"first_login: "+sharePref.getBoolean("first_login",false))
        Log.d(TAG,"id: "+sharePref.getString("id",""))
        Log.d(TAG,"Score: "+sharePref.getInt("Score",0))


    }
}
