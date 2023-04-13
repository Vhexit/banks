package com.example.vic_bankapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class kcb : AppCompatActivity() {

    lateinit var myweb:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)

        myweb = findViewById(R.id.kcbweb)
        val webSettings = myweb.settings
        webSettings.javaScriptEnabled = true
        myweb.loadUrl("https://ke.kcbgroup.com/")


    }
}