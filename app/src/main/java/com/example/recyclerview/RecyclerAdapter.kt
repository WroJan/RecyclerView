package com.example.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup




class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.CustomViewHolder>() {

    val recyclerArray = listOf<ArrayListf>()

    override fun getItemCount(): Int {
        return recyclerArray.size
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val layout = LayoutInflater.from(parent.context)
        val eachRow = layout.inflate(R.layout.main_recycler_view,parent, false)
        return CustomViewHolder(eachRow)


    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val arraydfdf = recyclerArray.get(position)
        //holder.view.title_View.text = arraydfdf





    }





    class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}