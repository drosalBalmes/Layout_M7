package com.example.layoutm7;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        ImageButton btn = findViewById(R.id.arrowbtn);
        btn.setOnClickListener(view -> startActivity(new Intent(RelativeLayout.this, twoLayouts.class)));
    }
}