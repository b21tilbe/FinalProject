package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21tilbe";
    //private final String JSON_FILE = "mountains.json";

    private List<Cupcake> cupcakeList;
    private CupcakeAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}