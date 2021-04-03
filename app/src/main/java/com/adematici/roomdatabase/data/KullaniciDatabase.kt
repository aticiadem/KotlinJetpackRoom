package com.adematici.roomdatabase.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.adematici.roomdatabase.model.KullaniciModel

@Database(entities = [KullaniciModel::class],version = 1)
abstract class KullaniciDatabase: RoomDatabase() {

    abstract fun kullaniciDao(): KullaniciDao

    companion object {
        private var instance: KullaniciDatabase? = null

        fun veritabaniAl(context: Context): KullaniciDatabase? {
            if(instance == null){
                instance = Room.databaseBuilder(
                    context,
                    KullaniciDatabase::class.java,
                    "kullanici.db"
                ).allowMainThreadQueries().build()
            }
            return instance
        }
    }

}