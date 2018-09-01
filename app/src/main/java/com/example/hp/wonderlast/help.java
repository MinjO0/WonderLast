package com.example.hp.wonderlast;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class help extends AppCompatActivity {
    android.support.v7.app.ActionBar ac;
    ImageView iv13;
    EditText e_feed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        iv13=(ImageView)findViewById(R.id.imageView13);
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_ph=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:8222842456"));
                startActivity(i_ph);
            }
        });
        ac=getSupportActionBar();
        ac.setTitle("Help & Feedback");
    }
    }

