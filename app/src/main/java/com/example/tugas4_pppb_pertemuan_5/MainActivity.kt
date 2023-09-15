package com.example.tugas4_pppb_pertemuan_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.tugas4_pppb_pertemuan_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    companion object{
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            btnRegist.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra(EXTRA_USERNAME,usernameInputEdittext.text.toString())
                intentToSecondActivity.putExtra(EXTRA_EMAIL,emailInputEdittext.text.toString())
                intentToSecondActivity.putExtra(EXTRA_PHONE,phoneInputEdittext.text.toString())
                intentToSecondActivity.putExtra(EXTRA_PASSWORD,passwordInputEdittext.text.toString())
                startActivity(intentToSecondActivity)
            }
            logIn.setOnClickListener {
                val intentToThirdActivity=
                    Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(intentToThirdActivity)
            }
        }
    }
}