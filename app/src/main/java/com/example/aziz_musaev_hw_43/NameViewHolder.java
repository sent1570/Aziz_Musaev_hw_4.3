package com.example.aziz_musaev_hw_43;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView nameTextView;
    LinearLayout itemContainer;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name_tv);
        itemContainer = itemView.findViewById(R.id.name_container);

    }
    public void bind (String name){
        nameTextView.setText(name);
    }
}
