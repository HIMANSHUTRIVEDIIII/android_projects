package com.example.foodorder;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class customlistview extends ArrayAdapter<String> {
    String[] product_type,product_name;
    int[] logos;
    Activity context;

    public customlistview(Activity context1, String[] product_name,String[] product_type,int[] logos) {
        super(context1, R.layout.foodlist);
        this.product_type = product_type;
        this.product_name = product_name;
        this.logos = logos;
        this.context = context1;
    }

    @Override
    public int getCount(){return product_name.length;}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.foodlist,null,true);
        CircleImageView circleimageview=rowView.findViewById(R.id.circleimage);
        TextView producttype=rowView.findViewById(R.id.textView11);
        TextView productname=rowView.findViewById(R.id.textView15);
        circleimageview.setImageResource(logos[position]);
        productname.setText(product_name[position]);
        producttype.setText(product_type[position]);

        return rowView;


    }
}
