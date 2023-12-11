package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class BolaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bola)
    }

    fun luas(view: View){
        var jarijari = findViewById<EditText>(R.id.jarijari)
        var hasil = findViewById<TextView>(R.id.hasil)

        var r = jarijari.text.toString().toDouble()

        var luas = 4 * 3.14 * r * r

        hasil.text = luas.toString()
    }

    fun volume(view: View){
        var jarijari = findViewById<EditText>(R.id.jarijari)
        var hasil = findViewById<TextView>(R.id.hasil)

        var r = jarijari.text.toString().toDouble()

        var volume = 4/3 * 3.14 * r * r * r

        hasil.text = volume.toString()
    }
}