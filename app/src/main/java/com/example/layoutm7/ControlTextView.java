package com.example.layoutm7;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ControlTextView extends AppCompatActivity {
    EditText nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_text_view);
//        nom = findViewById(R.id.nom);
//        String mytext = nom.getText().toString();
//
//        SpannableString spanString = new SpannableString(mytext);
//        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
//        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
//        spanString.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString.length(), 0);
//        nom.setText(spanString);

    }
}