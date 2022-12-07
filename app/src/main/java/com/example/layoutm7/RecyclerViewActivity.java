package com.example.layoutm7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recycler;
    ArrayList<String> listDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recycler = findViewById(R.id.recyclerId);
//        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        listDatos = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            listDatos.add("Resultat agradable #" + i+ " ");

        }
        AdapterDatos adapter = new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);
    }
}