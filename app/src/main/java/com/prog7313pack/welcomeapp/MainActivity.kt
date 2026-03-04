package com.prog7313pack.welcomeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //instainte variables
        val edittxtReturn = findViewById<EditText>(R.id.editxtName)
        val buttonSubmit = findViewById<Button>(R.id.btnSubmit)
        val buttonClear = findViewById<Button>(R.id.btnClear)
        val txtVieWelcome = findViewById<TextView>(R.id.txtDisplay)

        //processing of button
        buttonSubmit.setOnClickListener {
            val userName = edittxtReturn.text.toString().trim()

            if (userName.isNotEmpty()) {
                txtVieWelcome.text = getString(R.string.app_WelcomeMsg, userName)
            }else {
                txtVieWelcome.text = getString(R.string.app_instrusctions)
            }

        }

        // processing of clear
        buttonClear.setOnClickListener {
            edittxtReturn.text.clear()
            txtVieWelcome.text=""
            edittxtReturn.requestFocus()
        }




    }
}