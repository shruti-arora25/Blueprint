package com.example.recycler

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.databinding.ListItemBinding

class Adapter(private val newsList: ArrayList<News>):RecyclerView.Adapter<Adapter.MyViewHolder>(){


private lateinit var binding:ListItemBinding



    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {

    binding=ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
    val currentItem=newsList[position]
        holder.img.setImageResource(currentItem.titleImg)
        holder.heading.text=currentItem.heading


    }

    override fun getItemCount(): Int {
        return newsList.size
    }


   class MyViewHolder(binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {
       var img=binding.titleImg
       var heading=binding.heading


    }


}