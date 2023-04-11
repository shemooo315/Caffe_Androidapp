package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Pasta_menu extends AppCompatActivity {
    RecyclerView rc_menu;
    menuadapter menu_adapter;
    ArrayList<menuappmodel> info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_menu);

        rc_menu=findViewById(R.id.recycleview_menu);
        info=new ArrayList<>();
        info.add(new menuappmodel("Roomi,Flamanc,Mozzerella,Chedder","LASAGNE", "70 L.E" ,R.drawable.image_p1));
        info.add(new menuappmodel("cheese,pepproni","TOMATO PASTA ","60 L.E",R.drawable.image_p2));
        info.add(new menuappmodel("Mashrooms,tomatoes,onions,cheese","PASTA SALAD","80 L.E",R.drawable.image_p3));
        info.add(new menuappmodel("Cheese,tomato,","MACRONNES","90 L.E",R.drawable.image_p4));
        info.add(new menuappmodel("-------","CHiCKEN PASTA","100 L.E",R.drawable.image_p5));
        info.add(new menuappmodel("Meat,tomatos,onions,Cheese","SHRIMP PASTA","50 L.E",R.drawable.image_p6));
        info.add(new menuappmodel("FriedChicken,tomatos,onions,Cheese","CHICKEN PIZZA","40 L.E",R.drawable.image_p7));
        info.add(new menuappmodel("-------","RICOTTA","54 L.E",R.drawable.image_p8));
        info.add(new menuappmodel("-------","MEAT PASTA","54 L.E",R.drawable.image_p9));

        menu_adapter= new menuadapter(info);

        rc_menu.setAdapter(menu_adapter);   //to see adapter
        rc_menu.setLayoutManager(new LinearLayoutManager(this));

    }
}