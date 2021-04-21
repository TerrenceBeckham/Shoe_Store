package com.afrodroid.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afrodroid.shoestore.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.plant(Timber.DebugTree())
        Timber.i("OnCreate Called")
    }
}