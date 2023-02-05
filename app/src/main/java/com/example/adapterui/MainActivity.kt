package com.example.adapterui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adapterui.Adpters.Adapter
import com.example.adapterui.databinding.ActivityItemBinding
import com.example.adapterui.databinding.ActivityMainBinding
import com.example.adapterui.utils.User

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val list=ArrayList<User>()
    private  lateinit var userAdapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        userAdapter= Adapter(list)




        binding.apply {

            rv1.adapter=userAdapter
            btnSave.setOnClickListener {
                val user=User(
                    tvName.text.toString(),
                    tvAge.text.toString()
                )
                list.add(user)
                userAdapter.notifyDataSetChanged()
            }






//            Finish
        }
    }
}