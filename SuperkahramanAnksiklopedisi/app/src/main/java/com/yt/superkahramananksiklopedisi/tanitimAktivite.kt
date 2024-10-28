package com.yt.superkahramananksiklopedisi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yt.superkahramananksiklopedisi.databinding.ActivityMainBinding
import com.yt.superkahramananksiklopedisi.databinding.ActivityTanitimAktiviteBinding

class tanitimAktivite : AppCompatActivity() {

    private lateinit var binding: ActivityTanitimAktiviteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTanitimAktiviteBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //adaterdengelenintent.getSerializableExtra("secilenkahraman",superkahraman::class.java)


       // val adapterdengelenintent=intent
        //val secilenKahraman=adapterdengelenintent.getSerializableExtra("secilenkahraman") as superkahraman

        val secilenKahraman=mySingleton.secilensuperkahraman

        secilenKahraman?.let{
            binding.imageView.setImageResource(secilenKahraman.gorsel)
            binding.isimTextVEw.text=secilenKahraman.isim
            binding.meslekTextVEw.text=secilenKahraman.meslek

        }




    }
}



















