package com.example.foodorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class bottomnavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    foodfragment foodfragment=new foodfragment();
    groceryfragment groceryfragment=new groceryfragment();
    toysfragment toysfragment=new toysfragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnavigation);
        bottomNavigationView=findViewById(R.id.bottomnavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,foodfragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.food:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame1, foodfragment).commit();
                        return true;
                    case R.id.grocery:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame1, groceryfragment).commit();
                        return true;
                    case R.id.toys:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame1, toysfragment).commit();
                        return true;
                }
                return false;
            }
        });




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}