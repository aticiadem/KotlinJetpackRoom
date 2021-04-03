package com.adematici.roomdatabase.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adematici.roomdatabase.databinding.RecyclerRowBinding
import com.adematici.roomdatabase.model.KullaniciModel

class RecyclerAdapter(private var liste: ArrayList<KullaniciModel>): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(val itemBinding: RecyclerRowBinding): RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val isimSoyisim: String = liste[position].kullaniciId.toString() +
                "- " +
                liste[position].kullaniciIsim +
                " " +
                liste[position].kullaniciSoyisim
        holder.itemBinding.textViewIsimSoyisim.text = isimSoyisim
    }

    override fun getItemCount(): Int {
        return liste.size
    }

}