package com.example.foodorder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class foodfragment extends Fragment {

    public foodfragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    int[]  foodimage={R.drawable.gulabjamun,R.drawable.colddrinks,R.drawable.southindianfood,R.drawable.northindianfood,R.drawable.fastfood};
    String[] foodname={"Sweets","ColdDrinks","SouthIndian","NorthIndian","Fastfood"};
    String[] fooddetail={"Delicious Sweets","Lassi,Shakes,Juices","Dosa,Idli,Uttapam","Punjabi,Gujarati,Thalis","PavBhaji,Chinese,Burgers,Panipuri"};
    View view=inflater.inflate(R.layout.fragment_foodfragment,container,false);
    ListView listView=view.findViewById(R.id.foodlistview);
    foodadapter foodadapter=new foodadapter(getActivity(),foodname,fooddetail,foodimage);
    listView.setAdapter(foodadapter);




        return view;
    }
}