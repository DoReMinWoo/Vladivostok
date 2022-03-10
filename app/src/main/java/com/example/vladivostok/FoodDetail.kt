package com.example.vladivostok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.food_detail_activity.*

class FoodDetail : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_detail_activity)

        img_detail_food.setImageResource(intent.getIntExtra("img_food", 0))
        content_detail_food.setText(intent.getStringExtra("detail_food"))
    }
}