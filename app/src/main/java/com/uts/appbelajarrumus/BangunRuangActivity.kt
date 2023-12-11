package com.uts.appbelajarrumus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BangunRuangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bangun_ruang)

        val button_logout = findViewById(R.id.btn_logout) as Button
        val button_kubus = findViewById(R.id.btnKubus) as Button
        val button_balok = findViewById(R.id.btnBalok) as Button
        val button_bola = findViewById(R.id.btnBola) as Button

        button_logout.setOnClickListener {
            finish()
        }

        button_kubus.setOnClickListener {
            val intent = Intent(this, KubusActivity::class.java)
            startActivity(intent)
        }

        button_balok.setOnClickListener {
            val intent = Intent(this, BalokActivity::class.java)
            startActivity(intent)
        }

        button_bola.setOnClickListener {
            val intent = Intent(this, BolaActivity::class.java)
            startActivity(intent)
        }
    }
}