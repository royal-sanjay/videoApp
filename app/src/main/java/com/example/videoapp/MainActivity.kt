package com.example.videoapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoUrl="https://resource.flexclip.com/templates/video/226p/movie-trailer.mp4"

     val video=findViewById<VideoView>(R.id.sanjay)
      val mediaController=MediaController(this)
        mediaController.setAnchorView(video)
        video.setVideoURI(Uri.parse(videoUrl))
        video.setMediaController(mediaController)
        video.requestFocus()
        video.resume()
        video.start()

    }
}