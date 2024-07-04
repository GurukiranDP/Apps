package com.example.solar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class planetpage extends AppCompatActivity {
    public static final String KEY_NAME="name";
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetpage);
        b2=(Button) findViewById(R.id.button);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conn1 = new Intent(planetpage.this, MainActivity.class);
                conn1.putExtra(KEY_NAME,"The total no of planets is 8");
                setResult(RESULT_OK,conn1);
                finish();
            }
        });


    }
}