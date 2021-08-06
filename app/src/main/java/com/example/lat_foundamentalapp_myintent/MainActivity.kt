package com.example.lat_foundamentalapp_myintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Memperkenalkan button yang sudah ditambahkan di layout
        val btnMoveActivity: Button = findViewById(R.id.btn_move_actvity)

        // Menambahkan even onClick pada button btnMoveActivity
        btnMoveActivity.setOnClickListener(this)

    }

    // Pindah activity
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_actvity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}