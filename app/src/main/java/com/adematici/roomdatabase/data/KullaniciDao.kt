package com.adematici.roomdatabase.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.adematici.roomdatabase.model.KullaniciModel

@Dao
interface KullaniciDao {

    @Insert
    fun kullaniciEkle(kullanici: KullaniciModel)

    @Query("SELECT * FROM kullanici_tablo")
    fun kullanicilariGetir(): List<KullaniciModel>

}