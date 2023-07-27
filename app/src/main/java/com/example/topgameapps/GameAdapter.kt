package com.example.topgameapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class GameAdapter(val gameList:ArrayList<GameModel>):RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        lateinit var card_img:ImageView
        lateinit var card_title:TextView
        init {
            card_img = itemView.findViewById(R.id.cardviewImage)
            card_title = itemView.findViewById(R.id.textView)
            //Click Listener
            itemView.setOnClickListener {
                Toast.makeText(itemView.context,"You selected: ${gameList[adapterPosition].cardTitle}",Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.card_title.setText(gameList[position].cardTitle)
        holder.card_img.setImageResource(gameList[position].cardImg)

    }
}