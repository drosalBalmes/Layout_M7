package com.example.layoutm7;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        ImageButton btn = findViewById(R.id.arrowbtn);
        btn.setOnClickListener(view -> startActivity(new Intent(TableLayout.this, GridLayout.class)));
    }
}