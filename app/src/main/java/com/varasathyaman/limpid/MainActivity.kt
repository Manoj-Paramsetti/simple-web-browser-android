package com.varasathyaman.limpid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //private var myWebView: WebView = findViewById(R.id.webviewer)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
    }
    fun flightradar(view: View) {
        val url: String = ("https://www.flightradar24.com")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun windy(view: View) {
        val url: String = ("https://www.windy.com")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun maps(view: View) {
        val url: String = ("https://www.google.com/maps")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun amazon(view: View) {
        val url: String = ("https://www.amazon.in")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun flipkart(view: View) {
        val url: String = ("https://www.flipkart.com")
        val intent = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun olx(view: View) {
        val url: String = ("https://www.olx.in")
        val intent = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun snapdeal(view: View) {
        val url: String = "https://www.snapdeal.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun instagram(view: View) {
        val url: String = "https://www.instagram.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun facebook(view: View) {
        val url: String = "https://www.facebook.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun gmail(view: View) {
        val url: String = "https://mail.google.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun google(view: View) {
        val url: String = "https://www.google.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun duckduckgo(view: View) {
        val url: String = "https://www.duckduckgo.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun bing(view: View) {
        val url: String = ("https://www.bing.com")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun localhost(view: View) {
        val url: String = ("http://127.0.0.1/")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun cshub(view: View) {
        val url: String = ("https://www.cshub.com")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun shodan(view: View) {
        val url: String = ("https://www.shodan.io")
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun wifi(view: View) {
        val url: String = "http://192.168.1.1/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun timesNow(view: View) {
        val url: String = "https://timesnownews.com/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun googleNews(view: View) {
        val url: String = "https://news.google.com/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun indianExpress(view: View) {
        val url: String = "https://indianexpress.com/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun sunNews(view: View) {
        val url: String = "http://sunnewslive.in/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun kOTLIN(view: View) {
        val url: String = "https://developer.android.com/kotlin/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun nasa(view: View) {
        val url: String = "https://nasa.gov"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun firebase(view: View) {
        val url: String = "https://firebase.google.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun github(view: View) {
        val url: String = "https://github.com/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
    fun aDocs(view: View) {
        val url: String = "https://developer.android.com/docs/"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun worldmeter(view: View) {
        val url: String = "https://www.worldometer.info"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun yt(view: View) {
        val url: String = "https://youtube.com"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun mohfw(view: View) {
        val url: String = "https://mohfw.gov.in"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun pypi(view: View) {
        val url: String = "https://pypi.org"
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }

    fun go(view: View) {
        val url : String = Url.text.toString()
        val intent : Intent  = Intent(this,WebV::class.java)
        intent.putExtra("url",url)
        startActivity(intent)
    }
}