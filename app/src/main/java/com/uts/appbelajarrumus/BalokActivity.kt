package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class BalokActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)
    }

    fun luas(view: View){
        var panjang = findViewById<EditText>(R.id.panjang)
        var lebar = findViewById<EditText>(R.id.lebar)
        var tinggi = findViewById<EditText>(R.id.tinggi)
        var hasil = findViewById<TextView>(R.id.hasil)

        var p = panjang.text.toString().toDouble()
        var l = lebar.text.toString().toDouble()
        var t = tinggi.text.toString().toDouble()

        var luas = 2 * ((p * l) + (p * t) + (l * t))

        hasil.text = luas.toString()
    }

    fun keliling(view: View){
        var panjang = findViewById<EditText>(R.id.panjang)
        var lebar = findViewById<EditText>(R.id.lebar)
        var tinggi = findViewById<EditText>(R.id.tinggi)
        var hasil = findViewById<TextView>(R.id.hasil)

        var p = panjang.text.toString().toDouble()
        var l = lebar.text.toString().toDouble()
        var t = tinggi.text.toString().toDouble()

        var keliling = 4 * (p + l + t)

        hasil.text = keliling.toString()
    }

    fun volume(view: View){
        var panjang = findViewById<EditText>(R.id.panjang)
        var lebar = findViewById<EditText>(R.id.lebar)
        var tinggi = findViewById<EditText>(R.id.tinggi)
        var hasil = findViewById<TextView>(R.id.hasil)

        var p = panjang.text.toString().toDouble()
        var l = lebar.text.toString().toDouble()
        var t = tinggi.text.toString().toDouble()

        var volume = p * l * t

        hasil.text = volume.toString()
    }
}