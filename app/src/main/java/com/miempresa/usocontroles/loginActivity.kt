package com.miempresa.usocontroles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.miempresa.usocontroles.databinding.ActivityLoginBinding



class loginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnLogin.setOnClickListener(){
            val correo = binding.txtCorreo.text.toString()
            val contraseña = binding.txtContraseA.text.toString()
            if (correo == "correodemo@gmail.com"  && contraseña == "passworddemo") {
                val intent = Intent(this, VerificationActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "correo y/o contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }

        }
        }
}



    //val loginBtn = findViewById<Button>(R.id.btnLogin)
        //loginBtn.setOnClickListener {
          //  val intent = Intent(this, OTPActivity::class.java)
           // startActivity(intent)


        //}



