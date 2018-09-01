package com.example.hp.wonderlast;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    DrawerLayout mdrawer;
    ListView lv1;
    ActionBarDrawerToggle mtoggle;
    ActionBar ac;
    Integer fimagem[]={R.drawable.goa,R.drawable.gujarat,R.drawable.haryana,R.drawable.himachal,R.drawable.maharashtra,R.drawable.rajasthan,R.drawable.punjab};
String nm[]={"Goa","Gujarat","Haryana","Himachal","Maharashtra","Rajasthan","Punjab"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
lv1=(ListView)findViewById(R.id.lv12);
ownad ad=new ownad(this,fimagem,nm);
        lv1.setAdapter(ad);
        mdrawer=(DrawerLayout)findViewById(R.id.dl);
        mtoggle=new ActionBarDrawerToggle(this,mdrawer, R.string.open,R.string.close);
        mdrawer.addDrawerListener(mtoggle);

        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ac=getSupportActionBar();

        ac.setTitle("WonderLast");
        NavigationView n=(NavigationView)findViewById(R.id.navi);
        n.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int d=item.getItemId();
                if(d==R.id.account)
                {Intent i=new Intent(getApplicationContext(),Home.class);
                startActivity(i);
                    Toast.makeText(Home.this, "Home", Toast.LENGTH_SHORT).show();}
if(d==R.id.da)
{Intent i=new Intent(getApplicationContext(),developer.class);
    startActivity(i);
    Toast.makeText(Home.this, "developer info", Toast.LENGTH_SHORT).show();}

                if(d==R.id.setting)
                {Intent i=new Intent(getApplicationContext(),setting.class);
                    startActivity(i);
                    Toast.makeText(Home.this, "Setting", Toast.LENGTH_SHORT).show();}
                if(d==R.id.help)
                {Intent i=new Intent(getApplicationContext(),help.class);
                    startActivity(i);
                    Toast.makeText(Home.this, "help", Toast.LENGTH_SHORT).show();}
                if(d==R.id.About)
                {Intent i=new Intent(getApplicationContext(),about.class);
                    startActivity(i);
                    Toast.makeText(Home.this, "about", Toast.LENGTH_SHORT).show();}
                if(d==R.id.Exit)
                {Intent i=new Intent(getApplicationContext(),Splashscreendemo.class);
                    startActivity(i);
                    Toast.makeText(Home.this, "exit", Toast.LENGTH_SHORT).show();}
                return  true;
            }
        });
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
switch(view.getId())
{
    case R.id.textView2:
        if(position==0)
        {
            Intent i=new Intent(getApplicationContext(),goa.class);
startActivity(i);
        Toast.makeText(Home.this, "Goa is selected", Toast.LENGTH_SHORT).show();}
        if(position==1){

            Intent i=new Intent(getApplicationContext(),gujarat.class);
            startActivity(i);
            Toast.makeText(Home.this, "Gujarat is selected", Toast.LENGTH_SHORT).show();}
        if(position==2)
        { Intent i=new Intent(getApplicationContext(),haryana.class);
            startActivity(i);
            Toast.makeText(Home.this, "Haryana is selected", Toast.LENGTH_SHORT).show();}
        if(position==3)
        { Intent i=new Intent(getApplicationContext(),himachal.class);
            startActivity(i);
            Toast.makeText(Home.this, "Himachal  is selected", Toast.LENGTH_SHORT).show();}
        if(position==4)
        { Intent i=new Intent(getApplicationContext(),maharashtra.class);
            startActivity(i);
            Toast.makeText(Home.this, "Maharashtra is selected", Toast.LENGTH_SHORT).show();}
        if(position==5)
        { Intent i=new Intent(getApplicationContext(),rajasthan.class);
            startActivity(i);
            Toast.makeText(Home.this, "Rajasthan is selected", Toast.LENGTH_SHORT).show();}
        if(position==6)
        { Intent i=new Intent(getApplicationContext(),punjab.class);
            startActivity(i);
            Toast.makeText(Home.this, "Punjab is selected", Toast.LENGTH_SHORT).show();}
break;

case R.id.imageView:
    if(position==0)
    {
        Intent i=new Intent(getApplicationContext(),goa.class);
        startActivity(i);
        Toast.makeText(Home.this, "Goa is selected", Toast.LENGTH_SHORT).show();}
    if(position==1){

        Intent i=new Intent(getApplicationContext(),gujarat.class);
        startActivity(i);
        Toast.makeText(Home.this, "Gujarat is selected", Toast.LENGTH_SHORT).show();}
    if(position==2)
    { Intent i=new Intent(getApplicationContext(),haryana.class);
        startActivity(i);
        Toast.makeText(Home.this, "Haryana is selected", Toast.LENGTH_SHORT).show();}
    if(position==3)
    { Intent i=new Intent(getApplicationContext(),himachal.class);
        startActivity(i);
        Toast.makeText(Home.this, "Himachal  is selected", Toast.LENGTH_SHORT).show();}
    if(position==4)
    { Intent i=new Intent(getApplicationContext(),maharashtra.class);
        startActivity(i);
        Toast.makeText(Home.this, "Maharashtra is selected", Toast.LENGTH_SHORT).show();}
    if(position==5)
    { Intent i=new Intent(getApplicationContext(),rajasthan.class);
        startActivity(i);
        Toast.makeText(Home.this, "Rajasthan is selected", Toast.LENGTH_SHORT).show();}
    if(position==6)
    { Intent i=new Intent(getApplicationContext(),punjab.class);
        startActivity(i);
        Toast.makeText(Home.this, "Punjab is selected", Toast.LENGTH_SHORT).show();}







}
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item))
            return true;
        switch (item.getItemId()) {
            case R.id.setting:
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
                return true;
        }
        return true;
    }



   // @Override
   /* public boolean onOptionsItemSelected(MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }*/
}
