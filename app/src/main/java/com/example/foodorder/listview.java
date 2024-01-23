package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class listview extends AppCompatActivity {
    ListView lv;
    String product_type[]={"Bakrey Items","Vegetables","Plastic Items","FoodPackets","Bakrey Items","Vegetables","Plastic Items","FoodPackets","Bakrey Items","Vegetables","Plastic Items","FoodPackets"};
    String product_name[]={"Cake","Potato","Water Bottle","AlooSev","Cake","Potato","Water Bottle","AlooSev","Cake","Potato","Water Bottle","AlooSev"};
    int logos[]={R.drawable.backery,R.drawable.vegetables,R.drawable.plastic,R.drawable.foodpacket,R.drawable.backery,R.drawable.vegetables,R.drawable.plastic,R.drawable.foodpacket,R.drawable.backery,R.drawable.vegetables,R.drawable.plastic,R.drawable.foodpacket};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lv=findViewById(R.id.lv);
        customlistview customListview =new customlistview(this,product_name,product_type,logos);
        lv.setAdapter(customListview);


    }
}