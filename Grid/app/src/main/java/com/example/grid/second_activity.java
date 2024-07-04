package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class second_activity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = (ImageView) findViewById(R.id.imageview1);
        textView = (TextView) findViewById(R.id.tvName1);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            String text =bundle.getString("selectedName");
            textView.setText(String.valueOf(text));
            int resId=bundle.getInt("resId");
            imageView.setImageResource(resId);
            Toast.makeText(second_activity.this, "You have selected this image", Toast.LENGTH_SHORT).show();
        }
    }
}