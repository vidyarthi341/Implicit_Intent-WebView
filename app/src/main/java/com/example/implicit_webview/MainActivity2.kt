package com.example.implicit_webview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var web = findViewById<WebView>(R.id.webv)
            webSet(web)





    }

    private fun webSet(web: WebView) {
        web.webViewClient = WebViewClient()
        web.apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            web.loadUrl("https://www.linkedin.com/in/vikas-kumar-vidyarthi-b8b378256/")
        }
    }

}