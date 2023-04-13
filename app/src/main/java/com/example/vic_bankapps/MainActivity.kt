package com.example.vic_bankapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var kcb:Button
    lateinit var dtb:Button
    lateinit var equity:Button
    lateinit var family:Button
    lateinit var postbank:Button
    lateinit var absa:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kcb = findViewById(R.id.btnkcb)
        dtb = findViewById(R.id.btndtb)
        equity = findViewById(R.id.btnequity)
        family = findViewById(R.id.btnfamily)
        postbank = findViewById(R.id.btnpostbank)
        absa = findViewById(R.id.btnabsa)



        kcb.setOnClickListener {

            val kcbwebsite = Intent(this, kcb::class.java )
            startActivity(kcbwebsite)
        }





    }
}