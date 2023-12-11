package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class PersegiPanjangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)
    }

    fun luas(view: View){

        var panjang = findViewById<EditText>(R.id.panjang)
        var lebar = findViewById<EditText>(R.id.lebar)
        var luas = panjang.text.toString().toDouble() * lebar.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = luas.toString()
    }

    fun keliling(view: View){

        var panjang = findViewById<EditText>(R.id.panjang)
        var lebar = findViewById<EditText>(R.id.lebar)
        var keliling = 2 * (panjang.text.toString().toDouble() + lebar.text.toString().toDouble())
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = keliling.toString()
    }
}