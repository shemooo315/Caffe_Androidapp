package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Desserts_menu extends AppCompatActivity {
    RecyclerView rc_menu;
    menuadapter menu_adapter;
    ArrayList<menuappmodel> info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts_menu);

        rc_menu=findViewById(R.id.recycleview_menu);
        info=new ArrayList<>();
        info.add(new menuappmodel("Shoclate,Nuts,Donut dough","Donutes", "30 L.E" ,R.drawable.image_d1));
        info.add(new menuappmodel("Fruits,Cake,Strawbery Sauce","Mixed Cake","40 L.E",R.drawable.image_d2));
        info.add(new menuappmodel("cake,Strawbery sauce","Cheese Cake","50 L.E",R.drawable.image_d3));
        info.add(new menuappmodel("IceCream,nuts,Shoclate souce","Ice Creem","50 L.E",R.drawable.image_d4));
        info.add(new menuappmodel("Cake,Shoclate souce","Molten Cake","55 L.E",R.drawable.image_d5));
        info.add(new menuappmodel("Biscuit,Shoclate","Cookies","50 L.E",R.drawable.image_d6));
        info.add(new menuappmodel("Jelli,Candy","Jelli Candy","20 L.E",R.drawable.image_d7));
        info.add(new menuappmodel("Konafa,Dumblings,Basbousa,Cabbage","Eastren Sweets","60 L.E",R.drawable.image_d8));
        info.add(new menuappmodel("Oreo biscuits,Cake,IceCream","Oreo Cake","54 L.E",R.drawable.image_d9));

        menu_adapter= new menuadapter(info);

        rc_menu.setAdapter(menu_adapter);   //to see adapter
        rc_menu.setLayoutManager(new LinearLayoutManager(this));






    }
}