package com.eduardo300318007.lab06

import android.content.Intent
import android.net.Uri
import android.os.Bundle
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

        btnUrl.setOnClickListener {

            val uri: Uri = Uri.parse(txtResult.text.toString())
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        }

        btnData.setOnClickListener {

            val uri: Uri = Uri.parse(txtResult.text.toString() + "/data")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        }

        btnAdd.setOnClickListener {

            val uri: Uri = Uri.parse(txtResult.text.toString() + "/add")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        }
    }
}