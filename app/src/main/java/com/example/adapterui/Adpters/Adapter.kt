package com.example.adapterui.Adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adapterui.databinding.ActivityItemBinding
import com.example.adapterui.utils.User

class Adapter (val list: List<User>):RecyclerView.Adapter<Adapter.vh>(){

    inner class vh(val itemBinding: ActivityItemBinding):RecyclerView.ViewHolder(itemBinding.root){


        fun onBind(user: User){
            itemBinding.tvAge.text=user.age
            itemBinding.tvName.text=user.name
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {

        return vh(ActivityItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {

        return list.size
    }


}