package com.uts.appbelajarrumus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.uts.appbelajarrumus.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnLoginOnRegister.setOnClickListener() {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegisterOnRegister.setOnClickListener {
            val nik = binding.nik.text.toString()
            val namalengkap = binding.namalengkap.text.toString()
            val phone = binding.phone.text.toString()
            val email = binding.email.text.toString()
            val password = binding.passwordRegister.text.toString()

            // validasi nik
            if (nik.isEmpty()){
                binding.nik.error = "NIK harus Diisi"
                binding.nik.requestFocus()
                return@setOnClickListener
            }

            // validasi phone
            if (namalengkap.isEmpty()){
                binding.namalengkap.error = "Nama Lengkap harus Diisi"
                binding.namalengkap.requestFocus()
                return@setOnClickListener
            }

            // validasi phone
            if (phone.isEmpty()){
                binding.phone.error = "NO Handphone harus Diisi"
                binding.phone.requestFocus()
                return@setOnClickListener
            }

            // validasi email
            if (email.isEmpty()){
                binding.email.error = "Email harus Diisi"
                binding.email.requestFocus()
                return@setOnClickListener
            }

            // validasi email tidak valid
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.email.error = "Email tidak Valid"
                binding.email.requestFocus()
                return@setOnClickListener
            }

            // validasi password
            if (password.isEmpty()){
                binding.passwordRegister.error = "Password harus Diisi"
                binding.passwordRegister.requestFocus()
                return@setOnClickListener
            }

            // validasi panjang password
            if (password.length < 6) {
                binding.passwordRegister.error = "Password minimal 6 karakter"
                binding.passwordRegister.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email, password)
        }
    }

private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful) {
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}