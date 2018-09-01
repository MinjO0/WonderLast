package com.example.hp.wonderlast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class developer extends AppCompatActivity {
    ListView lv8;
    android.support.v7.app.ActionBar ac;
    String pro[]={"Sudhanshu Rajpal","Sudhanshurajpal9741@gmail.com","8222842456","Student","Using this app since 2018"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        lv8=(ListView)findViewById(R.id.lv8);
        ArrayAdapter ad9=new ArrayAdapter(this,android.R.layout.simple_list_item_1,pro);
        lv8.setAdapter(ad9);
        ac=getSupportActionBar();
        ac.setTitle("Profile");
    }
}
