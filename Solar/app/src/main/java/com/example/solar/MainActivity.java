package com.example.solar;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;

    ActivityResultLauncher <Intent> hello = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            TextView t1= (TextView) findViewById(R.id.textView);
            if(result!=null && result.getResultCode()==RESULT_OK) {
                if(result.getData()!=null && result.getData().getStringExtra(planetpage.KEY_NAME)!=null) {
                    t1.setText(result.getData().getStringExtra(planetpage.KEY_NAME));
                }
            }
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("First Activity");
        b1=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conn = new Intent(MainActivity.this, planetpage.class);
                hello.launch(conn);
            }
        });

    }
}