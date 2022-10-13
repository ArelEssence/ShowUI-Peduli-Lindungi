package com.arelessence.study_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class sukses_checkin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_checkin)


        val nama_tempat2 = findViewById<TextView>(R.id.nama_tempat2)
        val total_keramaian2 = findViewById<TextView>(R.id.total_keramaian2)
        val tanggal2 = findViewById<TextView>(R.id.tanggal2)
        val jam2 = findViewById<TextView>(R.id.jam2)
        val nama_orang2 = findViewById<TextView>(R.id.nama_orang2)

        val nama_tempat = intent.getStringExtra("EXTRA_NAMA_TEMPAT")
        val total_keramaian = intent.getStringExtra("EXTRA_TOTAL_KERAMAIAN")
        val tanggal = intent.getStringExtra("EXTRA_TANGGAL")
        val jam = intent.getStringExtra("EXTRA_JAM")
        val nama_orang = intent.getStringExtra("EXTRA_NAMA_ORANG")

        val output_nama_tempat = "$nama_tempat"
        val output_total_keramaian = "Total Keramaian: $total_keramaian"
        val output_tanggal = "$tanggal"
        val output_jam = "$jam"
        val output_nama_orang = "$nama_orang"

        nama_tempat2.text = output_nama_tempat
        total_keramaian2.text = output_total_keramaian
        tanggal2.text = output_tanggal
        jam2.text = output_jam
        nama_orang2.text = output_nama_orang
        }
    }
