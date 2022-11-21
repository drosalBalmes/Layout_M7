package com.example.layoutm7;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class twoLayouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_layouts);
        ToggleButton tb = (ToggleButton) findViewById(R.id.btnToggle);
        boolean isChecked;
        ImageButton btn = findViewById(R.id.arrowbtn);
        btn.setOnClickListener(view -> startActivity(new Intent(twoLayouts.this, RadioCheck.class)));
        tb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                if (tb.isChecked()){

                } else {

                }
            }
        });
    }
}