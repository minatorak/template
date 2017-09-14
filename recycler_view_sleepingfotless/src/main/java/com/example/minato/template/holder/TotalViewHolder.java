package com.example.minato.template.holder;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.minato.template.R;

public class TotalViewHolder extends RecyclerView.ViewHolder {
    public AppCompatTextView tvTotalPrice;
    public TotalViewHolder(View itemView) {
        super(itemView);
        tvTotalPrice = (AppCompatTextView) itemView.findViewById(R.id.tv_total_price);
    }
}
