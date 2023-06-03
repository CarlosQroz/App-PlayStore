package com.miempresa.usocontroles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_verification.*

class VerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        continueBtn.setOnClickListener(){
            var verificacion = editNumber.text.toString()

            if (verificacion == "956542458")  {
                val intent = Intent(this,  OTPActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Numero inexistente", Toast.LENGTH_SHORT).show()
            }

        }
    }
}