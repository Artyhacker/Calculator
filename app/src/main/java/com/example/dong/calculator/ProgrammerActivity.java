package com.example.dong.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dong on 16-7-28.
 */
public class ProgrammerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.programmer);
    }

}
