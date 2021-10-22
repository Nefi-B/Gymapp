package com.example.myapp1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>() {


    private val itemTitles = arrayOf(
        "Abs Beginner",
        "Abs Intermediate",
        "Battlerope",
        "BellyFat",
        "LowerAbdomen",
        "Abs Advanced"
    )


    private val itemImages = intArrayOf(
        R.drawable.absbeginner,
        R.drawable.absadvanced,
        R.drawable.battlerope,
        R.drawable.bellyfat,
        R.drawable.lowerbody,
        R.drawable.rockhardabs,

        )


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image: ImageView
        var textTitle: TextView

        init {
            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_model, parent, false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles[position]
        holder.image.setImageResource(itemImages[position])

        holder.itemView.setOnClickListener { v: View ->
            Toast.makeText(v.context, "Clicked on item", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }
}
