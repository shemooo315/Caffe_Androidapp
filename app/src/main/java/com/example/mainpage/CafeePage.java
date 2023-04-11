package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CafeePage extends AppCompatActivity {
    private RecyclerView cold_drinks_recycle;
    private RecyclerView.Adapter cold_drinks_adapter;
    private RecyclerView.LayoutManager cold_drinks_layout_manager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafee_page);

        ArrayList<drinks> colddrinks=new ArrayList<>();
        colddrinks.add(new drinks(R.drawable.pepsi,"Pepsi","20 L.E",R.id.btn));
        colddrinks.add(new drinks(R.drawable.cola,"Cola","20 L.E",R.id.btn));
        colddrinks.add(new drinks(R.drawable.schweppes_photo,"Schweppes","20 L.E",R.id.btn));
        colddrinks.add(new drinks(R.drawable.fanta,"Fanta","20 L.E",R.id.btn));
        colddrinks.add(new drinks(R.drawable.redbull,"Red Bull","40 L.E",R.id.btn));


        cold_drinks_recycle=findViewById(R.id.recycleview);

        cold_drinks_layout_manager=new LinearLayoutManager(this);
        cold_drinks_adapter=new cold_drinks_adapter(colddrinks);

        cold_drinks_recycle.setLayoutManager(cold_drinks_layout_manager);
        cold_drinks_recycle.setAdapter(cold_drinks_adapter);

    }
}