package com.example.layoutm7;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.*;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recycler;
    ArrayList<String> listDatos;
    Button dltbtn;
    SwipeRefreshLayout swipeRefreshLayout;
    AdapterDatos adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        dltbtn = findViewById(R.id.dltbtn);
        recycler = findViewById(R.id.recyclerId);
        swipeRefreshLayout = findViewById(R.id.swipe);
//        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recycler.setLayoutManager(new GridLayoutManager(this,2));
        listDatos = new ArrayList<String>();
        for (int i = 1; i < 100; i++) {
            listDatos.add("Resultat agradable #" + i + " ");

        }
        adapter = new AdapterDatos(listDatos);
        recycler.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recycler.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));
        recycler.setItemAnimator(new DefaultItemAnimator());


        swipe();
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alClick(view);
            }
        });
        recycler.setAdapter(adapter);
    }

    public void swipe() {
        swipeRefreshLayout.setOnRefreshListener(() -> {
            swipeRefreshLayout.setRefreshing(false);
        });

    }

    public void alClick(View view){
        //listDatos.remove(recycler.getChildAdapterPosition(view));
        //adapter.notifyItemRemoved(recycler.getChildAdapterPosition(view));
        listDatos.remove(recycler.getChildAdapterPosition(view));
        swipeRefreshLayout.setOnRefreshListener(() -> {
            adapter.notifyItemRemoved(recycler.getChildAdapterPosition(view));
            adapter.notifyItemRangeChanged(recycler.getChildAdapterPosition(view), listDatos.size());
            swipeRefreshLayout.setRefreshing(false);
        });
        int i = recycler.getChildAdapterPosition(view);
        Toast.makeText(getApplicationContext(), "Eliminat: " + listDatos.get(i) + " refresca la pagina", Toast.LENGTH_SHORT).show();
    }
}