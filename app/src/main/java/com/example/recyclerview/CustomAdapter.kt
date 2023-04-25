package com.example.recyclerview

import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<Modelclass>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        // inflates the card_view_design view
        // that is used to hold list item
        println("onCreateViewHolder")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemdesign, parent, false)
        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        println("onBindViewHolder")
        var resource:Int=mList.get(position).getimageview()
        var name:String=mList.get(position).gettextview1()
        var time:String=mList.get(position).gettextview2()
        var msg:String=mList.get(position).gettextview3()
        var line:String=mList.get(position).getdivider()
        println("will call setdata")
        holder.setdata(resource,name,time,msg,line)
    }

    // return the number of the items in the list
    override fun getItemCount(): Int
    {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView)
    {
        fun setdata(resource: Int, name: String, time: String, msg: String,line:String)
        {
            imageview.setImageResource(resource)
            textView1.setText(name)
            textView2.setText(time)
            textView3.setText(msg)
            textView4.setText(line)
        }

        private val imageview:ImageView= itemView.findViewById(R.id.imageview1)
        val textView1: TextView = itemView.findViewById(R.id.textview1)
        val textView2: TextView = itemView.findViewById(R.id.textview2)
        val textView3: TextView = itemView.findViewById(R.id.textview3)
        val textView4: TextView = itemView.findViewById(R.id.divider)
        
    }
}