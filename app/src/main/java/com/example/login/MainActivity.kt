package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password:EditText
    lateinit var login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email =findViewById(R.id.email)
        password=findViewById(R.id.password)
        login=findViewById(R.id.login)
        login.setOnClickListener{
            if(email.text.toString()=="abc@gmail.com"&&password.text.toString()=="1234") {
                Toast.makeText(this, "Log in Successful!!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, HomeScreen::class.java))
            }
            else{
                Toast.makeText(this,"Invalid credentials!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}