package com.example.notify_adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InterestAdapter extends RecyclerView.Adapter<InterestViewHolder> {

    private ArrayList<Interest> interestList;
    private ItemClickListener itemClickListener;

    public InterestAdapter(ArrayList<Interest> interestArrayList, ItemClickListener itemClickListener){
        interestList = interestArrayList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public InterestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent, false);
        return new InterestViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull InterestViewHolder holder, int position) {
        Interest interest = interestList.get(position);
        holder.setData(interest);
    }

    @Override
    public int getItemCount() {
        return interestList.size();
    }
}
