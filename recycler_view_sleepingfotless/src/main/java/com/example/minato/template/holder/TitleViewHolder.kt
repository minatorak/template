package com.example.minato.template.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.view_title.view.*

/**
 * Created by minato on 9/13/2017.
 */
class TitleViewHolder(itemView:View) : RecyclerView.ViewHolder( itemView) {
    public val tvTitle = itemView.tv_title
}