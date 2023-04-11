package com.example.mainpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class cold_drinks_adapter extends RecyclerView.Adapter<cold_drinks_adapter.ColdDrinksViewHolder> {
    private ArrayList<drinks>TheList;

    drinks currentItem;
    public static class ColdDrinksViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView product_name;
        public TextView price;
        public Button button;


        public ColdDrinksViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.photo);
            product_name=itemView.findViewById(R.id.name_of_content);
            price=itemView.findViewById(R.id.price);
            button=itemView.findViewById(R.id.btn);
        }
    }
    public cold_drinks_adapter( ArrayList<drinks> colddrinkslist){
        TheList=colddrinkslist;
    }

    @NonNull
    @Override
    public ColdDrinksViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cold_drinks,parent,false);
        ColdDrinksViewHolder ColdDrinksView=new ColdDrinksViewHolder(v);
        return ColdDrinksView;

    }


    @Override
    public void onBindViewHolder( ColdDrinksViewHolder holder, int position) {
         currentItem = TheList.get(position);
        holder.image.setImageResource(currentItem.getImageresource());
        holder.product_name.setText(currentItem.getProductname());
        holder.price.setText(currentItem.getProdductprice());


    }

    @Override
    public int getItemCount() {
        return TheList.size();
    }



}
