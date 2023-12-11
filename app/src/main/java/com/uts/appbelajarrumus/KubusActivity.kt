package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class KubusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubus)
    }

    fun luas(view: View) {
        var sisi = findViewById<EditText>(R.id.sisi)
        var hasil = findViewById<TextView>(R.id.hasil)

        var s = sisi.text.toString().toDouble()

        var luas = 6 * (s * s)

        hasil.text = luas.toString()
    }

    fun keliling(view: View) {
        var rusuk = findViewById<EditText>(R.id.rusuk)
        var hasil = findViewById<TextView>(R.id.hasil)

        var r = rusuk.text.toString().toDouble()

        var keliling = 12 * r

        hasil.text = keliling.toString()
    }

    fun volume(view: View) {
        var sisi = findViewById<EditText>(R.id.sisi)
        var hasil = findViewById<TextView>(R.id.hasil)

        var s = sisi.text.toString().toDouble()

        var volume = s * s * s

        hasil.text = volume.toString()
    }
}