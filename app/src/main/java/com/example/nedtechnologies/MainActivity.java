package com.example.nedtechnologies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

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

        allFragment = new AllFragment();
        catOneFragment = new CatOneFragment();
        catTwoFragment = new CatTwoFragment();

        setFragment(allFragment);

        bottomNavigationView = findViewById(R.id.bottombar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.all:
                        bottomNavigationView.setItemBackgroundResource(R.color.allbottom);

                        setFragment(allFragment);
                        return  true;
                    case R.id.catone:
                        bottomNavigationView.setItemBackgroundResource(R.color.catone);

                        setFragment(catOneFragment);
                        return true;
                    case R.id.cattwo:
                        bottomNavigationView.setItemBackgroundResource(R.color.cattwo);

                        setFragment(catTwoFragment);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
    public void setFragment (Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainframe, fragment);
        fragmentTransaction.commit();
    }
}