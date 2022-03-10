package com.example.recycleralbum.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.vladivostok.DataModel.FoodData
import com.example.vladivostok.FoodDetail
import com.example.vladivostok.R

class FoodAdapter(val FoodData: MutableList<FoodData>?)
    : RecyclerView.Adapter<FoodAdapter.MyViewHolder>() {
    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var title: TextView = itemview.findViewById(R.id.title_food)
        var address: TextView = itemview.findViewById(R.id.address_food)
        var thumbnail: ImageView = itemview.findViewById(R.id.img_food)
        var detail: TextView = itemview.findViewById(R.id.datail_food)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_card, parent, false)
        return MyViewHolder(view)
    }
    override fun getItemCount() = FoodData!!.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val food = FoodData!![position]
        holder.title.text = food.title
        holder.address.text = food.address
        holder.thumbnail.setImageResource(food.thumbnail)
        holder.detail.text = food.detail

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, FoodDetail::class.java)
            intent.putExtra("img_food", food.thumbnail)
            intent.putExtra("detail_food", food.detail)

            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }
    }


}



