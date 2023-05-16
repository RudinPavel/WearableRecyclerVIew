package com.example.wearablerecyclerviewlab

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.wearablerecyclerviewlab.databinding.ListItemBinding

class WearableRecyclerViewAdapter(val technologyList: MutableList<Technology>, val context: Context): RecyclerView.Adapter<WearableRecyclerViewAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = DataBindingUtil.inflate<ListItemBinding>(LayoutInflater.from(context), R.layout.list_item, parent, false)
        return Holder(binding)
    }

    override fun getItemCount() = technologyList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val technology = technologyList[position]
        holder.binding.data = technology
    }

    class Holder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}