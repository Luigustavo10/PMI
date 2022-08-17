package com.ds2.helloword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

const val EXTRA_MESSAGE = "com.ds2.helloword.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        val textoDaMensagem = findViewById<TextInputLayout>(R.id.TextMessage)
        val message = TextInputLayout.text.toString()
    }
}
