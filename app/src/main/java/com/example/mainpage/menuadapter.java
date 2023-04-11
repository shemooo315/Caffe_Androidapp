package com.example.mainpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class menuadapter extends RecyclerView.Adapter<menuadapter.menuViewHolder>{
    ArrayList<menuappmodel> data;


    public menuadapter(ArrayList<menuappmodel> data){
        this.data=data;

    }





    @NonNull
    @Override
    public menuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_items,parent,false);

        return new menuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull menuViewHolder holder, int position) {
        holder.txt_name.setText(data.get(position).name);
        holder.txt_description.setText(data.get(position).msg);
        holder.image_menu.setImageResource(data.get(position).img);
        holder.txt_price.setText(data.get(position).price);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class menuViewHolder extends RecyclerView.ViewHolder{
        ImageView image_menu;
        TextView txt_name,txt_description,txt_price;

        public menuViewHolder(@NonNull View itemView) {
            super(itemView);

            image_menu=itemView.findViewById(R.id.image_profile);
            txt_name=itemView.findViewById(R.id.textview_name);
            txt_description=itemView.findViewById(R.id.textView_msg);
            txt_price=itemView.findViewById(R.id.textView_price);
        }

    }

}

