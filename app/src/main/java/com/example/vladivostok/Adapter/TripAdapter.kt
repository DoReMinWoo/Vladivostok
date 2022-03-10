package com.example.vladivostok.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.vladivostok.R
import com.example.vladivostok.DataModel.TripData
import com.example.vladivostok.TripDetail
import kotlinx.android.synthetic.main.item_trip.view.*

class TripViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val title = v.title_trip
    val content = v.content_trip
    val img = v.img_trip
    val detail = v.datail_trip
}
class TripAdapter(val DataList: ArrayList<TripData>) : RecyclerView.Adapter<TripViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_trip, parent, false)
        return TripViewHolder(view)
    }
    override fun getItemCount() = DataList.size

    override fun onBindViewHolder(holder: TripViewHolder, position: Int) {
        val dData = DataList[position]
        holder.title.text = DataList[position].title
        holder.content.text = DataList[position].content
        holder.img.setImageResource(DataList[position].img)
        holder.detail.text = DataList[position].datail

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TripDetail::class.java)
            intent.putExtra("img", dData.img)
            intent.putExtra("detail", dData.datail)

            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }
    }


}


