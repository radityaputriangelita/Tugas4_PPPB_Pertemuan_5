package com.example.tugas4_pppb_pertemuan_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas4_pppb_pertemuan_5.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            LinkRegister.setOnClickListener{
                val intentToMainActivity =
                    Intent(this@ThirdActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}