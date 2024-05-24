package com.example.databindings

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.databindings.databinding.TickLayBinding

class itemAdapter (private  val items: List<Item>): RecyclerView.Adapter<itemAdapter.ViewHolder>(){
    inner class ViewHolder(itemView:TickLayBinding): RecyclerView.ViewHolder(itemView.root) {
//        val title: TextView = itemView.findViewById(R.id.itemTitle)
//        val description: TextView = itemView.findViewById(R.id.itemDescription)
   var elements = itemView.item
//        fun bind(
//            element: Item
//        ){
//            itemView.set
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       // val view = LayoutInflater.from(parent.context).inflate(R.layout.tick_lay, parent, false)
        val binding = TickLayBinding.inflate(LayoutInflater.from(parent.context) ,parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
    Log.d("StringItem","${item}")

        holder.elements = item

    }

    override fun getItemCount(): Int {
        return items.size
    }
}


