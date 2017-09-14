package com.example.minato.template.holder;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.minato.template.R;

/**
 * Created by minato on 9/14/2017.
 */

public class ButtonViewHolder extends RecyclerView.ViewHolder {
    public AppCompatButton btnPositive;
    public AppCompatButton btnNegative;
    public ButtonViewHolder(View itemView) {
        super(itemView);
        btnPositive =  (AppCompatButton)itemView.findViewById(R.id.btn_positive);
        btnNegative = (AppCompatButton)itemView.findViewById(R.id.btn_negative);
    }
}
