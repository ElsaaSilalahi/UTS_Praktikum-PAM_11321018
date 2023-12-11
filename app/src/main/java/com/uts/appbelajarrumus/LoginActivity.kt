package com.uts.appbelajarrumus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.uts.appbelajarrumus.databinding.ActivityLoginBinding

//private val ActivityLoginBinding.tvToRegister: Any
//    get() {}

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            binding.btnLogin.setOnClickListener {
                val email = binding.btnUsername.text.toString()
                val password = binding.btnPassword.text.toString()


                // validasi username
                if (email.isEmpty()) {
                    binding.btnUsername.error = "Username harus Diisi"
                    binding.btnUsername.requestFocus()
                    return@setOnClickListener
                }

                // validasi username tidak valid
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    binding.btnUsername.error = "Username tidak Valid"
                    binding.btnUsername.requestFocus()
                    return@setOnClickListener
                }

                // validasi password
                if (password.isEmpty()) {
                    binding.btnPassword.error = "Password harus Diisi"
                    binding.btnPassword.requestFocus()
                    return@setOnClickListener
                }

                LoginFirebase(email, password)

            }
        }

        fun LoginFirebase(email: String, password: String) {
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
            if (it.isSuccessful) {
                Toast.makeText(this, "Selamat datang $email", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
            }
        }
        }
    }