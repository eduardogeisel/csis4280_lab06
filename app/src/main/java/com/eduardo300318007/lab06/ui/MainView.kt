package com.eduardo300318007.lab06.ui

import android.app.Activity

import android.util.Log
import com.eduardo300318007.lab06.data.url
import com.eduardo300318007.lab06.utilities.FileHelper

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

import kotlinx.android.synthetic.main.activity_main.*

class MainView (ctx : Activity, fileName: String){
    private val myType = Types.newParameterizedType(List::class.java, url::class.java)


    init {
        Log.i("MainView", "init")
        val text = FileHelper.getDataFromAssets(ctx,fileName)
        Log.i("MainView", text)



        // Using data class Employee
        val moshi: Moshi = Moshi.Builder().build()
        val adapter : JsonAdapter<List<url>> = moshi.adapter(myType)
        val empList = adapter.fromJson(text)

        // ?: Elvis Operator
        for (e in empList ?: emptyList() ) {

            ctx.txtResult.append("${e.url}${e.port}\n")
            Log.i(this.toString(), "${e.url} - ${e.port}")
        }



    }
}