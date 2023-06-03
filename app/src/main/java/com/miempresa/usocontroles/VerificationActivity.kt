package com.miempresa.usocontroles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.miempresa.usocontroles.databinding.ActivityVerificationBinding


class VerificationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        binding = ActivityVerificationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.continueBtn.setOnClickListener(){
            val verificacion = binding.editNumber.text.toString()

            if (verificacion == "956542458")  {
                val intent = Intent(this,  OTPActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Numero inexistente", Toast.LENGTH_SHORT).show()
            }

        }
    }
}