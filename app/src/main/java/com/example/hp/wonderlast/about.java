package com.example.hp.wonderlast;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class about extends AppCompatActivity {
    ListView lv11;
    ActionBar ac;
    String about[]={"Open Source Licence","WonderLast Version 1.0","App Cetified"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        lv11=(ListView)findViewById(R.id.lv50);
        ArrayAdapter ad0=new ArrayAdapter(this,android.R.layout.simple_list_item_1,about);
        lv11.setAdapter(ad0);
        ac=getSupportActionBar();
        ac.setTitle("About");
    }
}
