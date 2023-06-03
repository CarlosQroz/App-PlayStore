package com.miempresa.usocontroles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_otpactivity.*

class OTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)

        continueBtnOtp.setOnClickListener(){
              var punto1 = otp_view1.text.toString()
              var punto2 = otp_view2.text.toString()
              var punto3 = otp_view3.text.toString()
              var punto4 = otp_view4.text.toString()
              var punto5 = otp_view5.text.toString()
              var punto6 = otp_view6.text.toString()


            if (punto1 == "6" && punto2 == "2" && punto3 == "8" && punto4 == "6" && punto5 == "8" && punto6 == "9") {
                val intent = Intent(this, LogrosActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Su codigo de verifacion es incorrecto", Toast.LENGTH_SHORT).show()
                       }

                 }

    }
}