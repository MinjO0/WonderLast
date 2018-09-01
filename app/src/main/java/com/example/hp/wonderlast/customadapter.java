package com.example.hp.wonderlast;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class customadapter extends ArrayAdapter {
    Activity ctx;
    Integer goaimage[];
    String nm[];
    public customadapter(@NonNull Activity context, Integer gimage[],String nm[]) {
        super(context, android.R.layout.simple_list_item_1,gimage);
        ctx=context;
        this.goaimage=gimage;
        this.nm=nm;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        LayoutInflater inflater=ctx.getLayoutInflater();
        convertView=inflater.inflate(R.layout.customadapter,null,true);
        ImageView iv123=(ImageView)convertView.findViewById(R.id.imageViewgeneral);
        TextView tv123=(TextView)convertView.findViewById(R.id.textViewgeneral);
        iv123.setImageResource(goaimage[position]);
        tv123.setText(nm[position]);
        iv123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ListView)parent).performItemClick(v,position,0);
            }
        });
        return convertView;
    }
}
