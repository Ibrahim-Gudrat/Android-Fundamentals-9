package com.abrahamgudratli.androidfundamentals9

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class SwipableViewAdapter(
    val imagesList: List<Int>
) : RecyclerView.Adapter<SwipableViewAdapter.SwipableViewHolder>() {

    inner class SwipableViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipableViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return SwipableViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }

    override fun onBindViewHolder(holder: SwipableViewHolder, position: Int) {
        holder.itemView.myImage.setImageResource(imagesList[position])
    }

}