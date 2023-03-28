package com.example.tugas1progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val NAMAPENGGUNA = intent.getStringExtra(MainActivity.NAMAPENGGUNA)
        val KATASANDI = intent.getStringExtra(MainActivity.KATASANDI)

        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)

        textView2.text = "Hi $NAMAPENGGUNA,"
        textView1.text = "Nama Pengguna: $NAMAPENGGUNA\nKata Sandi: $KATASANDI"
    }
}
