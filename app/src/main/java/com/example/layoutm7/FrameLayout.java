package com.example.layoutm7;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
    }

    public void toLinearLayout(View view){
        Intent intent = new Intent(this, LinearLayout.class);
        startActivity(intent);
    }
}