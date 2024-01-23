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

public class foodadapter extends ArrayAdapter<String> {
    String[] foodname,fooddetail;
    int[] foodimage;
    Activity context;

    public foodadapter(Activity context1, String[] foodname, String[] fooddetail, int[] foodimage) {
        super(context1, R.layout.foodlistt);
        this.foodname = foodname;
        this.fooddetail = fooddetail;
        this.foodimage = foodimage;
        this.context = context1;
    }
    @Override
    public int getCount() {
        return foodname.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {




        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.foodlistt,null,true);
        CircleImageView circleImageView=view.findViewById(R.id.sweetimage);
        TextView textView=view.findViewById(R.id.sweettext);
        TextView textView1=view.findViewById(R.id.delicioussweet);
        circleImageView.setImageResource(foodimage[position]);
        textView.setText(foodname[position]);
        textView1.setText(fooddetail[position]);





        return view;
    }
}
