package com.example.finalproject;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CupcakeAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Cupcake>Cupcakes = new ArrayList();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int number) {
        Cupcake cupcake = Cupcakes.get(number);

        holder.name.setText(cupcake.getName());
        holder.category.setText(cupcake.getCategory());
        holder.size.setText(String.valueOf(cupcake.getSize()));
    }

    @Override
    public int getItemCount() {
        return Cupcakes.size();
    };

    public void fetchCupcake(List<Cupcake> Cupcakes) {
        this.Cupcakes = Cupcakes;
    }

}
