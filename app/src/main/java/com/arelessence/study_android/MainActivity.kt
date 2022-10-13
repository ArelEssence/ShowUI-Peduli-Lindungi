package com.arelessence.study_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)

        val btncheckin = findViewById<Button>(R.id.btncheckin)
        val nama_tempat = findViewById<EditText>(R.id.nama_tempat)
        val total_keramaian = findViewById<EditText>(R.id.total_keramaian)
        val tanggal = findViewById<EditText>(R.id.tanggal)
        val jam = findViewById<EditText>(R.id.jam)
        val nama_orang = findViewById<EditText>(R.id.nama_orang)

        btncheckin.setOnClickListener {
            val nama_tempat = nama_tempat.text.toString()
            val total_keramaian = total_keramaian.text.toString()
            val tanggal = tanggal.text.toString()
            val jam = jam.text.toString()
            val nama_orang = nama_orang.text.toString()

            Intent(this, sukses_checkin::class.java).also {
                it.putExtra("EXTRA_NAMA_TEMPAT", nama_tempat)
                it.putExtra("EXTRA_TOTAL_KERAMAIAN", total_keramaian)
                it.putExtra("EXTRA_TANGGAL", tanggal)
                it.putExtra("EXTRA_JAM", jam)
                it.putExtra("EXTRA_NAMA_ORANG", nama_orang)
                startActivity(it)
            }
        }
    }
}








