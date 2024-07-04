package com.example.onlymce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    String str[] = {"Select Branch","CSE","ISE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adp = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,str);
        sp.setAdapter(adp);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index=parent.getSelectedItemPosition();
                if(index==1) {
                    Intent csei = new Intent(getApplicationContext(),cse.class);
                    startActivity(csei);
                }
                if(index==2) {
                    Intent isei = new Intent(getApplicationContext(),ise.class);
                    startActivity(isei);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}