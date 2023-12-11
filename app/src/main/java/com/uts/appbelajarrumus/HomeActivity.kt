package com.uts.appbelajarrumus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

//import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {

//    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button_logout = findViewById(R.id.btn_logout) as Button
        val button_bangun_datar = findViewById(R.id.btnbangunDatar) as Button
        val button_bangun_ruang = findViewById(R.id.btnbangunRuang) as Button

        button_logout.setOnClickListener {
            finish()
        }

        button_bangun_datar.setOnClickListener {
            val intent = Intent(this, BangunDatarActivity::class.java)
            startActivity(intent)
        }

        button_bangun_ruang.setOnClickListener {
            val intent = Intent(this, BangunRuangActivity::class.java)
            startActivity(intent)
        }

    }

}