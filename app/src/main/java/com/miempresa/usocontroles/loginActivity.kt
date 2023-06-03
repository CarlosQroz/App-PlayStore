package com.miempresa.usocontroles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener(){
            var correo = txtCorreo.text.toString()
            var contraseña = txtContraseña.text.toString()
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



