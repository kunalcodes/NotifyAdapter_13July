package com.example.notify_adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Interest> interestList = new ArrayList<>();
    private RecyclerView recyclerView;
    private InterestAdapter interestAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildRecyclerviewData();
        setRecyclerviewAdapter();
    }

    private void setRecyclerviewAdapter() {
        interestAdapter = new InterestAdapter(interestList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(interestAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void buildRecyclerviewData() {
        interestList.add(new Interest("Books",false));
        interestList.add(new Interest("Podcasts",false));
        interestList.add(new Interest("News",false));
        interestList.add(new Interest("Business",false));
        interestList.add(new Interest("Entertainment",false));
        interestList.add(new Interest("Sports",false));
        interestList.add(new Interest("Technology",false));
        interestList.add(new Interest("Pronunciation",false));
        interestList.add(new Interest("Grammar",false));
        interestList.add(new Interest("Health",false));
        interestList.add(new Interest("Health",false));
    }

    @Override
    public void onItemClicked(int position, Interest interest) {
        Interest updatedInterest;
        updatedInterest = new Interest(interest.getText(),!interest.isSelected());
        interestList.set(position, updatedInterest);
        interestAdapter.notifyDataSetChanged();

    }
}