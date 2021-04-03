package com.adematici.roomdatabase.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.adematici.roomdatabase.adapter.RecyclerAdapter
import com.adematici.roomdatabase.data.KullaniciDatabase
import com.adematici.roomdatabase.databinding.ActivityMainBinding
import com.adematici.roomdatabase.model.KullaniciModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val kullaniciDatabase: KullaniciDatabase? = KullaniciDatabase.veritabaniAl(this)

        binding.buttonKullaniciEkle.setOnClickListener {
            val isim: String = binding.editTextIsim.text.toString()
            val soyisim: String = binding.editTextSoyisim.text.toString()

            val kullanici = KullaniciModel(0,isim,soyisim)
            kullaniciDatabase?.kullaniciDao()?.kullaniciEkle(kullanici)
        }

        binding.buttonKullanicilariGor.setOnClickListener {
            binding.editTextIsim.setText("")
            binding.editTextSoyisim.setText("")
            val liste: ArrayList<KullaniciModel> =
                kullaniciDatabase?.kullaniciDao()?.kullanicilariGetir() as ArrayList<KullaniciModel>
            adapter = RecyclerAdapter(liste)
            binding.recyclerView.adapter = adapter
        }
    }

}