package com.example.hp.wonderlast;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class setting extends AppCompatActivity {
    ListView lv67;
    ActionBar ac;
    String set[]={"Clear Search History","Clear all History","Clear Notifications"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        lv67=(ListView)findViewById(R.id.lv67);
        ArrayAdapter ad67=new ArrayAdapter(this,android.R.layout.simple_list_item_1,set);
        lv67.setAdapter(ad67);
        ac=getSupportActionBar();
        ac.setTitle("Settings");
        lv67.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(setting.this, "Search history is cleared", Toast.LENGTH_SHORT).show();
                }
                if(position==1)
                {
                    Toast.makeText(setting.this, "All history is cleared", Toast.LENGTH_SHORT).show();
                }
                if(position==2)
                {
                    Toast.makeText(setting.this, "Notification is cleared", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

