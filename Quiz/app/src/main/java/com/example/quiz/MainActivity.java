package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView r1,r2,w1,w2;
    Button b1;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(ImageView) findViewById(R.id.imageView);
        r2=(ImageView) findViewById(R.id.imageView4);
        w1=(ImageView) findViewById(R.id.imageView2);
        w2=(ImageView) findViewById(R.id.imageView3);

        rb1=(RadioButton) findViewById(R.id.radioButton);
        rb2=(RadioButton) findViewById(R.id.radioButton2);
        rb3=(RadioButton) findViewById(R.id.radioButton3);
        rb4=(RadioButton) findViewById(R.id.radioButton4);
        rb5=(RadioButton) findViewById(R.id.radioButton5);
        rb6=(RadioButton) findViewById(R.id.radioButton6);
        rb7=(RadioButton) findViewById(R.id.radioButton7);
        rb8=(RadioButton) findViewById(R.id.radioButton8);

        b1 = (Button) findViewById(R.id.button);

        r1.setVisibility(View.INVISIBLE);
        r2.setVisibility(View.INVISIBLE);
        w1.setVisibility(View.INVISIBLE);
        w2.setVisibility(View.INVISIBLE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cnt=0;
                r1.setVisibility(View.INVISIBLE);
                r2.setVisibility(View.INVISIBLE);
                w1.setVisibility(View.VISIBLE);
                w2.setVisibility(View.VISIBLE);

                if(rb3.isChecked()) {
                    r1.setVisibility(View.VISIBLE);
                    w1.setVisibility(View.INVISIBLE);
                    cnt=cnt+1;
                }

                if(rb6.isChecked()) {
                    r2.setVisibility(View.VISIBLE);
                    w2.setVisibility(View.INVISIBLE);
                    cnt=cnt+1;
                }
                Toast.makeText(MainActivity.this, "Total :" + String.valueOf(cnt), Toast.LENGTH_SHORT).show();

            }
        });
    }
}