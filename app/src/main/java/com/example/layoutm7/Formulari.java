package com.example.layoutm7;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Formulari extends AppCompatActivity {
    EditText nom;
    EditText cognom;
    EditText mail;
    EditText telefon;
    EditText adreça;
    Spinner spn;

    SharedPreferences sharedPreferences;
    ListView simpleListView;
    // array objects
    String[] courseList = {"C-Programming", "Data Structure", "Database", "Python",
            "Java", "Operating System", "Compiler Design", "Android Development"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulari);
//        nom = findViewById(R.id.nom);
//        String mytext = nom.getText().toString();
//
//        SpannableString spanString = new SpannableString(mytext);
//        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
//        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
//        spanString.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString.length(), 0);
//        nom.setText(spanString);
        nom = findViewById(R.id.nom);
        cognom = findViewById(R.id.cognom);
        mail = findViewById(R.id.mail);
        telefon = findViewById(R.id.telefon);
        adreça = findViewById(R.id.adreça);
        spn = (Spinner) (findViewById(R.id.spinner));
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dgen, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);
        get();

        simpleListView = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.item_view, R.id.itemTextView, courseList);
        simpleListView.setAdapter(arrayAdapter);

    }

    @Override
    public void onPause() {
        super.onPause();
        save();
    }
    public void save(){
        sharedPreferences = getSharedPreferences(
                "Perfil", Context.MODE_PRIVATE);
        String spin = (String) spn.getSelectedItem();
        String nom = this.nom.getText().toString();
        String cognom = this.cognom.getText().toString();
        String mail = this.mail.getText().toString();
        String telefon = this.telefon.getText().toString();
        String adreça = this.adreça.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("nom",nom);
        editor.putString("cognom",cognom);
        editor.putString("mail",mail);
        editor.putString("telefon",telefon);
        editor.putString("adreça",adreça);
        editor.putString("genere", spin);
        editor.apply();

    }
    public void get(){
        sharedPreferences = getSharedPreferences(
                "Perfil", Context.MODE_PRIVATE);
        String genere = sharedPreferences.getString("genere", "");
        String nom = sharedPreferences.getString("nom","");
        String cognom = sharedPreferences.getString("cognom","");
        String mail = sharedPreferences.getString("mail","");
        String telefon = sharedPreferences.getString("telefon","");
        String adreça = sharedPreferences.getString("adreça","");
        this.nom.setText(sharedPreferences.getString("nom",nom));
        this.cognom.setText(sharedPreferences.getString("cognom",cognom));
        this.mail.setText(sharedPreferences.getString("mail",mail));
        this.telefon.setText(sharedPreferences.getString("telefon",telefon));
        this.adreça.setText(sharedPreferences.getString("adreça",adreça));
        if (sharedPreferences.getString("genere", genere).equals("Masculí")) {
            spn.setSelection(0);
        }
        if (sharedPreferences.getString("genere", genere).equals("Femení")) {
            spn.setSelection(1);
        } else {
            spn.setSelection(2);
        }
    }
}