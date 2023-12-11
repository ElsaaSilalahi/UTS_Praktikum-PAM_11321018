package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class PersegiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)
    }

    fun luas(view: View) {

        var sisi = findViewById<EditText>(R.id.sisi)
        var luas = sisi.text.toString().toDouble() * sisi.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = luas.toString()
        }

    fun keliling(view: View) {

        var sisi = findViewById<EditText>(R.id.sisi)
        var keliling = 4 * sisi.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = keliling.toString()
    }

}