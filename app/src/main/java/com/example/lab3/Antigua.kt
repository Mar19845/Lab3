package com.example.lab3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Antigua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val comentario1 = findViewById<EditText>(R.id.comentarioo)
        val comentario2 = findViewById<Button>(R.id.Comentario1)

        comentario2.setOnClickListener {
            val commentfinal = comentario1.text.toString()

            val main = Intent(this@Antigua, MainActivity::class.java)
            main.putExtra("Comentario_final", commentfinal)
            startActivity(main)
        }

    }
}
