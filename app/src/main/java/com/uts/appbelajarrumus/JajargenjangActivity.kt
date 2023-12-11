package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class JajargenjangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jajargenjang)
    }

    fun luas(view: View){

        var alas = findViewById<EditText>(R.id.alas)
        var tinggi = findViewById<EditText>(R.id.tinggi)
        var luas = alas.text.toString().toDouble() * tinggi.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = luas.toString()

    }

    fun keliling(view: View){

        var alas = findViewById<EditText>(R.id.alas)
        var sisi = findViewById<EditText>(R.id.sisi)
        var keliling = 2 * (alas.text.toString().toDouble() + sisi.text.toString().toDouble())
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = keliling.toString()

    }
}