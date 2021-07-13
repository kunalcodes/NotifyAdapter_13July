package com.example.notify_adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class InterestViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvText;
    private CardView mCvCardView;
    private View mViewLine;
    private ItemClickListener itemClickListener;

    public InterestViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvText = itemView.findViewById(R.id.tvText);
        mViewLine = itemView.findViewById(R.id.viewLine);
        mCvCardView = itemView.findViewById(R.id.cvCardView);
    }

    public void setData(Interest interest){
        mTvText.setText(interest.getText());
        if (interest.isSelected()){
            mCvCardView.setCardBackgroundColor(Color.parseColor("#0583EA"));
            mTvText.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            mCvCardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
            mTvText.setTextColor(Color.parseColor("#0583EA"));
        }
        mCvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(), interest);
            }
        });
    }
}
