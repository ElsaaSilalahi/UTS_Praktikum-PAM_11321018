package com.uts.appbelajarrumus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BangunDatarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bangun_datar)

        val button_logout = findViewById(R.id.btn_logout) as Button
        val button_hitung_persegi = findViewById(R.id.btnPersegi) as Button
        val button_hitung_persegi_panjang = findViewById(R.id.btnPersegiPanjang) as Button
        val button_hitung_segitiga = findViewById(R.id.btnSegitiga) as Button
        val button_jajar_genjang = findViewById(R.id.btnJajarGenjang) as Button
        val button_lingkaran = findViewById(R.id.btnLingkaran) as Button

        button_hitung_persegi.setOnClickListener {
            val intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }

        button_hitung_persegi_panjang.setOnClickListener {
            val intent = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(intent)
        }

        button_hitung_segitiga.setOnClickListener {
            val intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }

        button_jajar_genjang.setOnClickListener {
            val intent = Intent(this, JajargenjangActivity::class.java)
            startActivity(intent)
        }

        button_lingkaran.setOnClickListener {
            val intent = Intent(this, LingkaranActivity::class.java)
            startActivity(intent)
        }

        button_logout.setOnClickListener {
            finish()
        }
    }
}
