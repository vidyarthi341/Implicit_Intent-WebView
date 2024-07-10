package com.example.implicit_webview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        var call = findViewById<CardView>(R.id.callme)
        var linkedin = findViewById<CardView>(R.id.linked)
        var twitter = findViewById<CardView>(R.id.twit)


        call.setOnClickListener {

            var i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:7903408859")
            startActivity(i)

        }

        linkedin.setOnClickListener {

            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://www.linkedin.com/in/vikas-kumar-vidyarthi-b8b378256/")
            startActivity(i)

        }
        twitter.setOnClickListener {

            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://x.com/vidyarthi3001")
            startActivity(i)


        }






    }
}