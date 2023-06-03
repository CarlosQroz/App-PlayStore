package com.miempresa.usocontroles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.miempresa.usocontroles.databinding.ActivityOtpactivityBinding


class OTPActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtpactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)

        binding = ActivityOtpactivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.continueBtnOtp.setOnClickListener{
            val punto1 = binding.otpView1.text.toString()
            val punto2 = binding.otpView2.text.toString()
            val punto3 = binding.otpView3.text.toString()
            val punto4 = binding.otpView4.text.toString()
            val punto5 = binding.otpView5.text.toString()
            val punto6 = binding.otpView6.text.toString()

            if (punto1 == "6" && punto2 == "2" && punto3 == "8" && punto4 == "6" && punto5 == "8" && punto6 == "9") {
                val intent = Intent(this, LogrosActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Su código de verificación es incorrecto", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
