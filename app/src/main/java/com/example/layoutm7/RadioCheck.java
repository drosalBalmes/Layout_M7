package com.example.layoutm7;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RadioCheck extends AppCompatActivity {
    CheckBox chkbox;
    CheckBox chkbox2;
    RadioButton rad1;
    RadioButton rad2;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_check);
        chkbox = findViewById(R.id.chkbx);
        chkbox2 = findViewById(R.id.chkbx2);
        rad1 = findViewById(R.id.rad1);
        rad2 = findViewById(R.id.rad2);
        text = findViewById(R.id.textView);

        ImageButton btn = findViewById(R.id.arrowbtn);
        btn.setOnClickListener(view -> startActivity(new Intent(RadioCheck.this, ControlTextView.class)));


        chkbox.setOnClickListener(arg0 -> {
            if (chkbox.isChecked()) {
                chkbox.setText("aceptas que te robemos todos los datos y se los vendamos al estado islamico?  !MuyBien!");
            } else {
                chkbox.setText("aceptas que te robemos todos los datos y se los vendamos al estado islamico?  Lo tendremos en cuenta....");
            }
        });

        chkbox2.setOnClickListener(arg0 -> {
            if (chkbox2.isChecked()) {
                chkbox2.setText("Bueno algo hace");
            }
        });


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rad1:
                if (checked)
                    text.setText("Opcio seleccionada: opcio 1");
                    break;
            case R.id.rad2:
                if (checked)
                    text.setText("Opcio seleccionada: opcio 2");

                break;
        }
    }


}
