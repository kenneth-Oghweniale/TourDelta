package com.kenneth.tourdelta

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kenneth.tourdelta.databinding.ItemDisplayLayoutBinding

class Item_Adapter(val item_display: List<Item_Data_Class>):RecyclerView.Adapter<Item_Adapter.ItemViewHolder>() {
    class ItemViewHolder (val binding: ItemDisplayLayoutBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(itemDisplay: Item_Data_Class){
            binding.rectangle11.drawable
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Item_Adapter.ItemViewHolder {
        val binding: ItemDisplayLayoutBinding = ItemDisplayLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Item_Adapter.ItemViewHolder, position: Int) {
        holder.bind(item_display.get(position))
    }

    override fun getItemCount() = item_display.size


}