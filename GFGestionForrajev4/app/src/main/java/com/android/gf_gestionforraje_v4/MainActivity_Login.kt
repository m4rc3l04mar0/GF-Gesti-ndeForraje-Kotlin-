package com.android.gf_gestionforraje_v4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        val btn_ingresar = findViewById<Button?>(R.id.btn_Ingresar)



        btn_ingresar.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)




        })
    }
}