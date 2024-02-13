package com.example.practica02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        var saludoCalculadora = findViewById<TextView>(R.id.SaludoCal)
        saludoCalculadora.text = "calculadora"

        var btnregresa = findViewById<Button>(R.id.regresacalculadora)
        btnregresa.setOnClickListener {
            finish()
        }
    }
}