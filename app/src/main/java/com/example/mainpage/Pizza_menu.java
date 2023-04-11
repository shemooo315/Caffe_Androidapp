package com.example.mainpage;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Pizza_menu extends AppCompatActivity {
    RecyclerView rc_menu;
    menuadapter menu_adapter;
    ArrayList<menuappmodel> info;
    Button pizzabtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);

        rc_menu=findViewById(R.id.recycleview_menu);
        info=new ArrayList<>();






        info.add(new menuappmodel("Roomi,Flamanc,Mozzerella,Chedder","MARGHERITA", "70 L.E" ,R.drawable.img_pizza));
        info.add(new menuappmodel("cheese,pepproni","PEPPERONI","60 L.E",R.drawable.img_pizza2));
        info.add(new menuappmodel("Mashrooms,tomatoes,onions,cheese","MASHROOMS","80 L.E",R.drawable.img_pizza3));
        info.add(new menuappmodel("Cheese,tomato,","SUPREME PIZZA","90 L.E",R.drawable.img_pizza));
        info.add(new menuappmodel("-------","VEGGIE PIZZA","100 L.E",R.drawable.img_pizza3));
        info.add(new menuappmodel("Meat,tomatos,onions,Cheese","MEAT PIZZA","50 L.E",R.drawable.img_pizza2));
        info.add(new menuappmodel("FriedChecken,tomatos,onions,Cheese","CHICKEN PIZZA","40 L.E",R.drawable.img_pizza));
        info.add(new menuappmodel("-------","BUFFALO PIZZA","54 L.E",R.drawable.img_pizza3));


        menu_adapter= new menuadapter(info);
        rc_menu.setAdapter(menu_adapter);   //to see adapter
        rc_menu.setLayoutManager(new LinearLayoutManager(this));

    }
}