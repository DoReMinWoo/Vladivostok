package com.example.vladivostok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.trip_detail_activity.*

class TripDetail : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trip_detail_activity)

        img_detail.setImageResource(intent.getIntExtra("img", 0))
        content_detail.setText(intent.getStringExtra("detail"))
    }
}