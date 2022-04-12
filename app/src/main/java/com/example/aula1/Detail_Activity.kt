package com.example.aula1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula1.databinding.ActivityDetailBinding

class Detail_Activity : AppCompatActivity() {
    private lateinit var biding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)

        setSupportActionBar(biding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}