package com.yt.superkahramananksiklopedisi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.yt.superkahramananksiklopedisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var superkahramanlistesi:ArrayList<superkahraman>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val batman=superkahraman("batman","iş adamı",R.drawable.batman)
        val ironman=superkahraman("ironman","iş adamı",R.drawable.ironman)
        val spiderman=superkahraman("spiderman","öğrenci",R.drawable.spiderman)
        val wolverine=superkahraman("wolverine","asker",R.drawable.wolv)

        superkahramanlistesi=arrayListOf(batman,ironman,spiderman,wolverine)



        val adapter=superkahramanadapter(superkahramanlistesi)
        binding.superkahramanid.layoutManager=LinearLayoutManager(this)
        binding.superkahramanid.adapter=adapter
    }
}