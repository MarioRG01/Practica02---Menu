package com.example.practica02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var saludoPrincipal = findViewById<TextView>(R.id.SaludoP)
        saludoPrincipal.text = "todo va a funcionar"

        var btncalculadora = findViewById<Button>(R.id.btncalculadora)
        var btnimc = findViewById<Button>(R.id.btnimc)

        btncalculadora.setOnClickListener {
            startActivity(Intent(this,Calculadora::class.java))
        }

        btnimc.setOnClickListener {
            startActivity(Intent(this,IMC::class.java))
        }
    }
}