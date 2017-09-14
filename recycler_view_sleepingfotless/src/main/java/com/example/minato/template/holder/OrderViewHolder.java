package com.example.minato.template.holder;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.minato.template.R;


public class OrderViewHolder extends RecyclerView.ViewHolder {
    public AppCompatTextView tvOrderName;
    public AppCompatTextView tvOrderDetail;
    public AppCompatTextView tvOrderPrice;

    public OrderViewHolder(View itemView) {
        super(itemView);
        tvOrderName = (AppCompatTextView) itemView.findViewById(R.id.tv_order_name);
        tvOrderDetail = (AppCompatTextView) itemView.findViewById(R.id.tv_order_description);
        tvOrderPrice = (AppCompatTextView) itemView.findViewById(R.id.tv_order_price);
    }
}
