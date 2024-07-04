package com.example.programmatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1 = new EditText(this);
        EditText e2 = new EditText(this);
        EditText e3 = new EditText(this);

        e1.setText("Name : ");
        e2.setText("Roll no : ");
        e3.setText("Branch : ");

        e1.setTextSize(20);
        e2.setTextSize(20);
        e3.setTextSize(20);

        Button b1=new Button(this);
        b1.setText("Submit");
        b1.setTextSize(20);

        TextView t1=new TextView(this);
        TextView t2=new TextView(this);
        TextView t3=new TextView(this);

        t1.setText("Name : ");
        t2.setText("Roll no : ");
        t3.setText("Branch : ");


        t1.setTextSize(20);
        t2.setTextSize(20);
        t3.setTextSize(20);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(e1);
        layout.addView(e2);
        layout.addView(e3);
        layout.addView(b1);
        layout.addView(t1);
        layout.addView(t2);
        layout.addView(t3);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

        this.addContentView(layout,params);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();
                String str3 = e3.getText().toString();

                t1.setText(str1);
                t2.setText(str2);
                t3.setText(str3);

            }
        });
    }
}