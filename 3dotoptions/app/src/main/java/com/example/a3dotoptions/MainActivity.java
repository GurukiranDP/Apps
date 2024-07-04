package com.example.a3dotoptions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Files");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"NEW");
        menu.add(0,1,1,"OPEN");
        menu.add(0,2,2,"SAVE");
        menu.add(0,3,3,"SAVE AS");
        menu.add(0,4,4,"PRINT");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0 : Toast.makeText(this, "You have selected New option", Toast.LENGTH_SHORT).show();
                    return true;
            case 1 : Toast.makeText(this, "You have selected Open option", Toast.LENGTH_SHORT).show();
                return true;
            case 2 : Toast.makeText(this, "You have selected Save option", Toast.LENGTH_SHORT).show();
                return true;
            case 3 : Toast.makeText(this, "You have selected Save As option", Toast.LENGTH_SHORT).show();
                return true;
            case 4 : Toast.makeText(this, "You have selected Print option", Toast.LENGTH_SHORT).show();
                return true;
            default: return false;
        }

    }
}