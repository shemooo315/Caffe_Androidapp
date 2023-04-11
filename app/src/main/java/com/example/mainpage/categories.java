package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class categories extends AppCompatActivity {
    private Spinner spinner;
    Button pizza,pasta,dessert;
    @Override

    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        spinner =findViewById(R.id.spinner);
        pizza=(Button)findViewById(R.id.button2) ;
        pasta=(Button)findViewById(R.id.button3);
        dessert=(Button)findViewById(R.id.button4);
        List<String> categories =new ArrayList<>();
        categories.add(0,"Drinks");
        categories.add("Hot Drinks");
        categories.add("Cold Drinks");
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.Spinner_items,R.layout.custom_spinner);


        adapter.setDropDownViewResource(R.layout.drobdown);
        //connect dataAdapter to spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {
                String selectedDrink = parent.getItemAtPosition(position).toString();
               if (selectedDrink.equals("Hot Drinks")){

                       Intent i=new Intent(getApplicationContext(),Hot_CafeePage.class);
                       startActivity(i);
               }
               else
                   if(selectedDrink.equals("Cold Drinks")) {
                       Intent i=new Intent(getApplicationContext(),CafeePage.class);
                       startActivity(i);
                   }
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Pizza_menu.class);
                startActivity(intent);
            }
        });
        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Pasta_menu.class);
                startActivity(intent);
            }
        });
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Desserts_menu.class);
                startActivity(intent);
            }
        });
    }



}