package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView :RecyclerView
    lateinit var userlist :ArrayList<Modelclass>
    lateinit var adapter:CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initdata()
        initrecyclerview()
    }

    private fun initrecyclerview()
    {
        recyclerView=findViewById(R.id.recyclerview)
        adapter=CustomAdapter(userlist)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=adapter
        adapter.notifyDataSetChanged()
    }

    private fun initdata()
    {
        userlist= ArrayList()
        userlist.add(Modelclass("banana","10.43 AM","How are you","___________________________________",R.drawable.banana))
        userlist.add(Modelclass("grape","1:70 PM","Hello","___________________________________",R.drawable.grape))
        userlist.add(Modelclass("guava","11:00 AM","whatssup","___________________________________",R.drawable.guava))
        userlist.add(Modelclass("orange","8:24 PM","Had food?","___________________________________",R.drawable.orange))
        userlist.add(Modelclass("watermelon","7:09 PM","safe journey","___________________________________",R.drawable.watermelon))
        userlist.add(Modelclass("mango","12:00 AM","good night","___________________________________",R.drawable.mango))
        userlist.add(Modelclass("watermelon","7:09 PM","safe journey","___________________________________",R.drawable.watermelon))
        userlist.add(Modelclass("mango","12:00 AM","good night","___________________________________",R.drawable.mango))
        userlist.add(Modelclass("banana","10.43 AM","How are you","___________________________________",R.drawable.banana))
        userlist.add(Modelclass("grape","1:70 PM","Hello","___________________________________",R.drawable.grape))
        userlist.add(Modelclass("guava","11:00 AM","whatssup","___________________________________",R.drawable.guava))
        userlist.add(Modelclass("orange","8:24 PM","Had food?","___________________________________",R.drawable.orange))
        userlist.add(Modelclass("watermelon","7:09 PM","safe journey","___________________________________",R.drawable.watermelon))
        userlist.add(Modelclass("mango","12:00 AM","good night","___________________________________",R.drawable.mango))
        userlist.add(Modelclass("watermelon","7:09 PM","safe journey","___________________________________",R.drawable.watermelon))
        userlist.add(Modelclass("mango","12:00 AM","good night","___________________________________",R.drawable.mango))
    }
}