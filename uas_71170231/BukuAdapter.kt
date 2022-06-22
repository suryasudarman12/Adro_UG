package com.example.uas_71170231

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class BukuAdapter(var listBuku: ArrayList<Buku>, var context: Context): RecyclerView.Adapter<BukuAdapter.Bukuholder>() {
    class Bukuholder(val view: View): RecyclerView.ViewHolder(view) {
        fun bind(buku: Buku, context: Context) {
            view.findViewById<ImageView>(R.id.imgCover).setImageResource(buku.cover)
            view.findViewById<TextView>(R.id.judul).setText(buku.judul)
            view.findViewById<TextView>(R.id.penerbit).setText(buku.penerbit)
            view.findViewById<TextView>(R.id.penulis).setText(buku.penulis)
            view.findViewById<TextView>(R.id.tahun).setText(buku.tahun)
            view.findViewById<TextView>(R.id.halaman).setText(buku.halama)

            view.setOnClickListener {
                Toast.makeText(view.context, "${buku.judul}: ${buku.penulis}: ${buku.penerbit} : ${buku.tahun}: ${buku.halama}",Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Bukuholder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.tampilan_buku, parent,false)
        return Bukuholder(v)
    }

    override fun onBindViewHolder(holder: Bukuholder, position: Int) {
        holder.bind(listBuku[position], context)
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }
}