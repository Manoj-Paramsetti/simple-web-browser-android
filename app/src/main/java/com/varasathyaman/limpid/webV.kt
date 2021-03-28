package com.varasathyaman.limpid

import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebView.RENDERER_PRIORITY_BOUND
import android.webkit.WebView.RENDERER_PRIORITY_WAIVED
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_v.*


class WebV : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_web_v)
        webview.settings.setGeolocationEnabled(true)
        webview.settings.cacheMode
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            webview.settings.safeBrowsingEnabled
        }
        webview.settings.javaScriptEnabled =true
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            webview.setRendererPriorityPolicy(RENDERER_PRIORITY_BOUND, true)
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            webview.setRendererPriorityPolicy(RENDERER_PRIORITY_WAIVED, true)
        }
        webview.settings.allowFileAccess = false

        webview.webViewClient = WebViewClient()

        val url : String = intent.getStringExtra("url")
        webview.loadUrl(url)
    }
    override fun onBackPressed() {

        if (webview.canGoBack()) {
            webview.goBack()
        }

        else{
            super.onBackPressed()
        }
    }
}