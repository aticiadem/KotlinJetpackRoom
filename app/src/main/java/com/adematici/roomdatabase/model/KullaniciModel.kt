package com.adematici.roomdatabase.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kullanici_tablo")
data class KullaniciModel(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "kullaniciId")
    val kullaniciId: Int,
    @ColumnInfo(name = "kullaniciIsim")
    val kullaniciIsim: String,
    @ColumnInfo(name = "kullaniciSoyisim")
    val kullaniciSoyisim: String

)
