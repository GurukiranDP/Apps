package com.example.multiemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.system.StructCmsghdr;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editTextText);
        et2 = findViewById(R.id.editTextText2);
        et3 = findViewById(R.id.editTextText3);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String list = et1.getText().toString();
                String[] rec = list.split(",");
                String sub = et2.getText().toString();
                String msg =  et3.getText().toString();
                Intent in = new Intent(Intent.ACTION_SEND);
                in.putExtra(Intent.EXTRA_EMAIL,rec);
                in.putExtra(Intent.EXTRA_SUBJECT,sub);
                in.putExtra(Intent.EXTRA_TEXT,msg);
                in.setType("message/rfc822");
                startActivity(Intent.createChooser(in,"Choose mail app"));

            }
        });
    }

}