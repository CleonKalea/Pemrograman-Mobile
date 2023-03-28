package com.example.tugas1progmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object {
        const val NAMAPENGGUNA = "com.example.tugasprogmob1.MainActivity.NAMAPENGGUNA"
        const val KATASANDI = "com.example.tugasprogmob1.MainActivity.KATASANDI"
    }

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button2)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openMainActivity2()
            }
        })
    }

    private fun openMainActivity2() {
        val NamaPengguna = findViewById<EditText>(R.id.NamaPengguna)
        val StrNamaPengguna = NamaPengguna.text.toString()

        val KataSandi = findViewById<EditText>(R.id.KataSandi)
        val StrKataSandi = KataSandi.text.toString()

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(NAMAPENGGUNA, StrNamaPengguna)
        intent.putExtra(KATASANDI, StrKataSandi)
        startActivity(intent)
    }
}
