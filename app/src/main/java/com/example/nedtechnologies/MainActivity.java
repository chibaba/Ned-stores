package com.example.nedtechnologies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    private AllFragment allFragment;
    private CatOneFragment catOneFragment;
    private CatTwoFragment catTwoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottombar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.all:
                        bottomNavigationView.setItemBackgroundResource(R.color.allbottom);
                        return  true;
                    case R.id.catone:
                        bottomNavigationView.setItemBackgroundResource(R.color.catone);
                        return true;
                    case R.id.cattwo:
                        bottomNavigationView.setItemBackgroundResource(R.color.cattwo);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
}