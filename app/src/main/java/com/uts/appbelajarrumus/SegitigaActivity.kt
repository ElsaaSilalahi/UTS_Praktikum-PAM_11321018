package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SegitigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)
    }

    fun luas(view: View){

        var alas = findViewById<EditText>(R.id.alas)
        var tinggi = findViewById<EditText>(R.id.tinggi)
        var luas = 0.5 * alas.text.toString().toDouble() * tinggi.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = luas.toString()
    }

    fun keliling(view: View){

        var sisi = findViewById<EditText>(R.id.sisi)
        var keliling = 3 * sisi.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = keliling.toString()
    }
}