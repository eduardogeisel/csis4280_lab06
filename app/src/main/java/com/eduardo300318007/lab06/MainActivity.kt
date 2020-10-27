package com.eduardo300318007.lab06

import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.eduardo300318007.lab06.ui.MainView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val FILENAME = "url.json"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResult.setText("")
        val mv = MainView(this, FILENAME)

        btnShowWeb.setOnClickListener {
            val uri: Uri = Uri.parse(txtResult.text.toString())
            val myWebView: WebView = findViewById(R.id.webview)
            myWebView.loadUrl(txtResult.text.toString())
        }

        btnData.setOnClickListener {
            val uri: Uri = Uri.parse(txtResult.text.toString() + "/data")
            val myWebView: WebView = findViewById(R.id.webview)
            myWebView.loadUrl(txtResult.text.toString() + "/data")
        }

        btnAdd.setOnClickListener {
            val uri: Uri = Uri.parse(txtResult.text.toString() + "/add")
            val myWebView: WebView = findViewById(R.id.webview)
            myWebView.loadUrl(txtResult.text.toString() + "/add")
        }
    }
}