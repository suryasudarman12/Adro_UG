package com.example.uas_71170231

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listBuku = arrayListOf<Buku>()
        listBuku.add(Buku("ahmad","jubaedah","pt.subaki","1998","223", R.drawable.ic_launcher_background))
        listBuku.add(Buku("ahmad","jubaedah","pt.subaki","1998","223", R.drawable.ic_launcher_background))
        listBuku.add(Buku("ahmad","jubaedah","pt.subaki","1998","223", R.drawable.ic_launcher_background))
        listBuku.add(Buku("ahmad","jubaedah","pt.subaki","1998","223", R.drawable.ic_launcher_background))
    }
}