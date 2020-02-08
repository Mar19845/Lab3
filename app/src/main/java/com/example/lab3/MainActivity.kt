package com.example.lab3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val favorito = findViewById<Button>(R.id.Favorito)
        val Livingston = findViewById<Button>(R.id.Livingston)
        val Flores = findViewById<Button>(R.id.Flores)
        val antigua = findViewById<Button>(R.id.antigua)
        val Nombre = findViewById<TextView>(R.id.nombre)
        val infoNombre = findViewById<EditText>(R.id.infoNombre)
        val posNombre =  findViewById<TextView>(R.id.posNombre)

        favorito.setOnClickListener {
            if (Nombre.getVisibility() == VISIBLE) {
                posNombre.visibility = View.VISIBLE
                posNombre.text = infoNombre.text
                infoNombre.visibility = View.INVISIBLE
                Nombre.visibility = View.INVISIBLE
            } else {

                if (Nombre.getVisibility() == INVISIBLE) {
                    posNombre.visibility = View.INVISIBLE
                    infoNombre.visibility = View.VISIBLE
                    Nombre.visibility = View.VISIBLE
                    posNombre.text = infoNombre.text
                    }
                }
            }
        antigua.setOnClickListener {
            val antigua1 = Intent(this,Antigua::class.java)
            startActivity(antigua1)

        }

    }

}
