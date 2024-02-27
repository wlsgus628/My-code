package com.example.self_introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class firstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btnGoTOMainActivity: Button = findViewById(R.id.button)
        // 버튼 클릭시 화면 전환하는 코드 생성

        btnGoTOMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            //MainActivity로 이동
            finish()
        }

    }
}