package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Hot_CafeePage extends AppCompatActivity {
    private RecyclerView hot_drinks_recycle;
    private RecyclerView.Adapter hot_drinks_adapter;
    private RecyclerView.LayoutManager hot_drinks_layout_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_cafee_page);

        ArrayList<hot_drinks> hotdrinks=new ArrayList<>();
        hotdrinks.add(new hot_drinks(R.drawable.teaa,"Tea","20 L.E",R.id.btn_hot));
        hotdrinks.add(new hot_drinks(R.drawable.coffe,"Nescafe","20 L.E",R.id.btn_hot));
        hotdrinks.add(new hot_drinks(R.drawable.blackcoffe,"Black Coffe","20 L.E",R.id.btn_hot));
        hotdrinks.add(new hot_drinks(R.drawable.teamilk,"Milk Tea","20 L.E",R.id.btn_hot));

        hotdrinks.add(new hot_drinks(R.drawable.hotchocolate,"Hot Chocolate","20 L.E",R.id.btn_hot));



        hot_drinks_recycle=findViewById(R.id.recycleview_hot);

        hot_drinks_layout_manager=new LinearLayoutManager(this);
        hot_drinks_adapter=new hot_drinks_adapter(hotdrinks);

        hot_drinks_recycle.setLayoutManager(hot_drinks_layout_manager);
        hot_drinks_recycle.setAdapter(hot_drinks_adapter);
    }
}