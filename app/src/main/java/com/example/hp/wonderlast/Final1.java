package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Final1 extends AppCompatActivity {
    ImageView ivf;
    TextView tvf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final1);
        ivf=(ImageView)findViewById(R.id.imageView2final1);
        tvf=(TextView) findViewById(R.id.textView5);
        Intent i=getIntent();
        ivf.setImageResource(i.getIntExtra("image1",0));
        String pwd=i.getStringExtra("uname");
        tvf.setText(pwd);
    }
}
