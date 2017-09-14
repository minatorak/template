package com.example.minato.template.holder

import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.view_summary.view.*

class SummaryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvSummaryName:AppCompatTextView = itemView.tv_summary_name;
    val tvSummaryPrice = itemView.tv_summary_price

}