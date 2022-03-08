package com.example.publicapiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.publicapiproject.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    lateinit var gifView : pl.droidsonroids.gif.GifImageView
    lateinit var urlCall : String

    companion object {
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val catAPI = RetrofitHelper.getInstance().create(CatInfo::class.java)

        //https://cataas.com/cat/gif?json=true, get the url code at the end and stitch to end of base url

        Picasso.get().load("https://cataas.com" + urlCall).into(gifView)
    }
}