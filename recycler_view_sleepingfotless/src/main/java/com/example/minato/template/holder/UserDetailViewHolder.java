package com.example.minato.template.holder;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.minato.template.R;

/**
 * Created by minato on 9/13/2017.
 */

public class UserDetailViewHolder extends RecyclerView.ViewHolder {
    public AppCompatTextView tvUserName;
    public UserDetailViewHolder(View itemView) {
        super(itemView);
        tvUserName = itemView.findViewById(R.id.textView);
    }
}
