package com.yt.superkahramananksiklopedisi

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yt.superkahramananksiklopedisi.databinding.RecyclerRowBinding

class superkahramanadapter(val superkahramanlistesi:ArrayList<superkahraman>) :RecyclerView.Adapter<superkahramanadapter.superKahramanViewHolder>(){
    class superKahramanViewHolder(val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): superKahramanViewHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return superKahramanViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return superkahramanlistesi.size
    }

    override fun onBindViewHolder(holder: superKahramanViewHolder, position: Int) {
        holder.binding.textView.text = superkahramanlistesi[position].isim

        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,tanitimAktivite::class.java)
            mySingleton.secilensuperkahraman=superkahramanlistesi[position]
            intent.putExtra("secilenkahraman",superkahramanlistesi[position])
            holder.itemView.context.startActivity(intent)
        }
    }















}