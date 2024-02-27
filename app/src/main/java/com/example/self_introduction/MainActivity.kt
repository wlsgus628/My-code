package com.example.self_introduction

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    private var isPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ImageBtn = findViewById<ImageButton>(R.id.btn_mail)
        val btnBackToMainActivity: ImageButton = findViewById(R.id.ib_close)
        val btnSing: ImageButton = findViewById(R.id.btn_sing)

        //MediaPlayer 초기화
        mediaPlayer = MediaPlayer.create(this, R.raw.bibi)
        mediaPlayer?.isLooping = true // 노래 반복 재생
        // 노래 재생/일시 정지 버튼
        btnSing.setOnClickListener {
            if (isPlaying) {
                mediaPlayer?.pause()
            } else {
                mediaPlayer?.start()
            }
            isPlaying = !isPlaying
        }


        val btn_self: ImageButton = findViewById(R.id.btn_self)


        btn_self.setOnClickListener {

            val intent = Intent(this, introduceActivity::class.java)
            startActivity(intent)
            //IntroduceActivity로 이동

            val btn_mail: ImageButton = findViewById(R.id.btn_mail)
            btn_self.setOnClickListener {

                var intent = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://wlsgus.tistory.com/"))
                    startActivity(intent)






                val btnClose: ImageButton = findViewById(R.id.ib_close)
                btnClose.setOnClickListener {
                    val intent = Intent(this, firstActivity::class.java)
                    startActivity(intent)

                }
            }
        }
    }
}






