package com.example.layoutm7;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
        ImageButton btn = findViewById(R.id.arrowbtn);
        Button recycler = findViewById(R.id.recyclerbtn);
        btn.setOnClickListener(view -> startActivity(new Intent(FrameLayout.this, LinearLayout.class)));
        recycler.setOnClickListener(view -> startActivity(new Intent(FrameLayout.this, RecyclerViewActivity.class)));

    }

}