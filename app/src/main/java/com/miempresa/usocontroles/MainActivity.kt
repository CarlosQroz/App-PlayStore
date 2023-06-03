package com.miempresa.usocontroles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.analytics.FirebaseAnalytics


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inicioBtn = findViewById<Button>(R.id.mainBtn)
            inicioBtn.setOnClickListener {
               val intent = Intent(this, loginActivity::class.java)
                startActivity(intent)}

        val analyticcs = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Imtegracion de Firebase completa")
        analyticcs.logEvent("InitScren", bundle )




    }
}