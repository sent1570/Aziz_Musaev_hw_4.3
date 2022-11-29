package com.example.aziz_musaev_hw_43;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    RecyclerView namesRecyclerView;
private ArrayList<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namesRecyclerView = findViewById(R.id.names_rv);
        names = new ArrayList<>();
        setNames();
        namesRecyclerView.setAdapter(new NameAdapter(names,this));
    }
    private void setNames(){
        names.add("Black");
        names.add("Brown");
        names.add("Gray");
        names.add("White");
        names.add("Yellow");
        names.add("Orange");
        names.add("Red");
        names.add("Pink");
        names.add("Purple");
        names.add("Blue");
        names.add("Green");
    }

    @Override
    public void onItemClickListener(String name) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("color",name);
        startActivity(intent);
    }
}