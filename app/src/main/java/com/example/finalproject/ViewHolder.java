package com.example.finalproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{

    public TextView name;
    public TextView category;
    public TextView size;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.cupcakeName);
        category = itemView.findViewById(R.id.category);
        size = itemView.findViewById(R.id.size);
    }
}