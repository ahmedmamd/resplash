package com.example.mashal.resplash;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mashal.resplash.pager_adapter.main_pager;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    main_pager main_pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_pager);
        Log.i("main", "onCreate: ");
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        main_pager =new main_pager(getSupportFragmentManager());
        viewPager.setAdapter(main_pager);
    }
}
