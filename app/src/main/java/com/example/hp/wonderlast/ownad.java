package com.example.hp.wonderlast;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.ImageViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ownad extends ArrayAdapter {
    Activity ctx;
    Integer fimage[];
    String t[];
    public ownad(@NonNull Activity context, Integer fimage1[],String b[]) {
        super(context, android. R.layout.simple_list_item_1,fimage1);
        ctx=context;
        this.fimage=fimage1;
        this.t=b;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        LayoutInflater inflater=ctx.getLayoutInflater();
        convertView =inflater.inflate(R.layout.ownad,null,true);
        ImageView iv=(ImageView)convertView.findViewById(R.id.imageView);
        TextView tv=(TextView)convertView.findViewById(R.id.textView2);
        tv.setText(t[position]);
        iv.setImageResource(fimage[position]);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ListView)parent).performItemClick(v,position,0);

            }
        });
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ListView)parent).performItemClick(v,position,0);

            }
        });
        return  convertView;
    }
}
