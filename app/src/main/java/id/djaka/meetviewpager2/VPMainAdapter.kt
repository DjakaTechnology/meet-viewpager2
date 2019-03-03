/*
 * Copyright (c) 2019.
 * Written By Djaka Pradana Jaya Priambudi
 */

package id.djaka.meetviewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vp_item.view.*

class VPMainAdapter(var data:ArrayList<PageModel>) : RecyclerView.Adapter<VPMainAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.vp_item, parent,false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.run {
            tv_item.text = data.get(holder.adapterPosition).message
            layout.setBackgroundResource(data.get(holder.adapterPosition).color)
        }
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}