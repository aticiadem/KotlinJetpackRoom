package com.adematici.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adematici.roomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonKullaniciEkle.setOnClickListener {
            val isim: String = binding.editTextIsim.text.toString()
            val soyisim: String = binding.editTextSoyisim.text.toString()
        }

        binding.buttonKullanicilariGor.setOnClickListener {
            val isim: String = binding.editTextIsim.text.toString()
            val soyisim: String = binding.editTextSoyisim.text.toString()
        }
    }

}