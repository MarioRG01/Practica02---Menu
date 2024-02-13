package com.example.practica02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        var saludoIMC = findViewById<TextView>(R.id.SaludoIMC)
        saludoIMC.text = "IMC"

        var btnregresa = findViewById<Button>(R.id.regresaimc)
        btnregresa.setOnClickListener {
            finish()
        }
    }
}