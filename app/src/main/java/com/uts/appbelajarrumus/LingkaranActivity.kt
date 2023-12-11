package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class LingkaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)
    }

    fun luas(view: View){

        var jarijari = findViewById<EditText>(R.id.jarijari)
        var luas = 3.14 * jarijari.text.toString().toDouble() * jarijari.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = luas.toString()

    }

    fun keliling(view: View){

        var jarijari = findViewById<EditText>(R.id.jarijari)
        var keliling = 2 * 3.14 * jarijari.text.toString().toDouble()
        var hasil = findViewById<TextView>(R.id.hasil)

        hasil.text = keliling.toString()

    }
}