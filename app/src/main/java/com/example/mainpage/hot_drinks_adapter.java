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

 public class hot_drinks_adapter extends RecyclerView.Adapter<hot_drinks_adapter.HotDrinksViewHolder> {
     private ArrayList<hot_drinks>hotlist;
     hot_drinks current;


     public static class HotDrinksViewHolder extends RecyclerView.ViewHolder {
         public ImageView hot;
         public TextView hot_name;
         public TextView hot_price;
         public Button hot_button;

        public HotDrinksViewHolder(@NonNull View itemView) {
            super(itemView);
            hot=itemView.findViewById(R.id.photo_hot);
            hot_name=itemView.findViewById(R.id.name_of_content_hot);
            hot_price=itemView.findViewById(R.id.price_hot);
            hot_button=itemView.findViewById(R.id.btn_hot);
        }
    }
    public hot_drinks_adapter( ArrayList<hot_drinks> hotdrinkslist){
        hotlist=hotdrinkslist;
    }

    @NonNull
    @Override
    public hot_drinks_adapter.HotDrinksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.hot_drinks,parent,false);
        hot_drinks_adapter.HotDrinksViewHolder HotDrinksView=new hot_drinks_adapter.HotDrinksViewHolder(v);
        return HotDrinksView;

    }

     @Override
     public void onBindViewHolder(@NonNull HotDrinksViewHolder holder, int position) {
         current=hotlist.get(position);
         holder.hot.setImageResource(current.getImageresource());
         holder.hot_name.setText(current.getProductname());
         holder.hot_price.setText(current.getProdductprice());



     }




    @Override
    public int getItemCount() {
        return hotlist.size();
    }
}