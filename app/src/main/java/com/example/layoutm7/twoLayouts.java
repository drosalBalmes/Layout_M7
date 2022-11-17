package com.example.layoutm7;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class twoLayouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_layouts);
        ToggleButton tb = (ToggleButton) findViewById(R.id.btnToggle);
        boolean isChecked;
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