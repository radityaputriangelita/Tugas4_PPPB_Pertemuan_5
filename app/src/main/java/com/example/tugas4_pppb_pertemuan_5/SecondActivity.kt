package com.example.tugas4_pppb_pertemuan_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import com.example.tugas4_pppb_pertemuan_5.databinding.ActivityMainBinding
import com.example.tugas4_pppb_pertemuan_5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val UserName = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val EMail = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val PhonE = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        with(binding){
            welcomeUsername.text = UserName
            activeEmail.text = EMail
            activePhone.text = PhonE
        }
    }
}