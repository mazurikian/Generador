package com.android.generador

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var textViewHora: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewHora = findViewById(R.id.textViewHora)

        // Obtener la hora local y mostrarla
        val horaLocal = obtenerHoraLocal()
        textViewHora.text = "Hora local: $horaLocal"
    }

    private fun obtenerHoraLocal(): String {
        val formatoHora = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        return formatoHora.format(Date())
    }
}