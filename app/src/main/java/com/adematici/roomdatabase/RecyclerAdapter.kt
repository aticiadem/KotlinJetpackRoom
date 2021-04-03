package com.adematici.roomdatabase

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adematici.roomdatabase.databinding.RecyclerRowBinding

class RecyclerAdapter(private var liste: ArrayList<KullaniciModel>): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(val itemBinding: RecyclerRowBinding): RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.itemBinding.textViewIsimSoyisim.text = ""
    }

    override fun getItemCount(): Int {
        return liste.size
    }

}