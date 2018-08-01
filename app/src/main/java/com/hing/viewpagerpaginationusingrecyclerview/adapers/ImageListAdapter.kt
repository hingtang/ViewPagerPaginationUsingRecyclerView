package com.hing.viewpagerpaginationusingrecyclerview.adapers

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by HingTang on 8/1/18.
 * Profile: https://github.com/hingtang
 * Email: hing.tang.1115@gmail.com
 */
class ImageListAdapter(private val imageList: ArrayList<String> = arrayListOf(),
                       private val context: Context)
    : RecyclerView.Adapter<ImageListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ImageView(parent.context)
        view.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(imageList[position]).into(holder.itemView as ImageView)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}
