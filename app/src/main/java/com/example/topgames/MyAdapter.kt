package com.example.topgames

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val gamesList : ArrayList<GameModel>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

         var gameImage :ImageView
         var gameName : TextView

        init {
            gameImage = itemView.findViewById<ImageView>(R.id.imageView)
            gameName = itemView.findViewById(R.id.textView)

            // click listeners
            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,"You choose : ${gamesList[adapterPosition].name}",Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       var v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false)
       return MyViewHolder(v)
    }
    override fun getItemCount(): Int {
        return gamesList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameName.text=gamesList[position].name
        holder.gameImage.setImageResource(gamesList[position].img)
    }
}