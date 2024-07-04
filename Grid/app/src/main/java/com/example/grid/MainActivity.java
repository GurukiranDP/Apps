package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int [] images= {R.drawable.burger,R.drawable.pizz,R.drawable.sun,R.drawable.mercury,R.drawable.solar};
    String [] names={"burger","pizza","sun","Mercury","solar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        CustomAdapter customAdapter=new CustomAdapter(names,images,this);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName=names[i];
                int selectedImage=images[i];
                Intent sec=new Intent(MainActivity.this,second_activity.class);
                sec.putExtra("selectedName",selectedName);
                sec.putExtra("resId",selectedImage);
                startActivity(sec);
            }
        });
    }
    public class CustomAdapter extends BaseAdapter {
        private String[] imageNames;
        private  int[] imagePhoto;
        private Context context;
        private LayoutInflater layoutInflater;
        public CustomAdapter(String[] imageNames,int[] imagePhoto,Context context){
            this.imageNames = imageNames;
            this.imagePhoto = imagePhoto;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return imagePhoto.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view==null) {
                view = layoutInflater.inflate(R.layout.row_items, viewGroup, false);
            }
            TextView tvName=view.findViewById(R.id.tvName);
            ImageView imageView=view.findViewById(R.id.imageview);
            tvName.setText(imageNames[i]);
            imageView.setImageResource(imagePhoto[i]);
            return view;
        }
    }
}
