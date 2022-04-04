package com.dis.proeditor.ActivityNoInternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dis.proeditor.R;

public class ActivityNoInternet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet);
    }
    public void noInternet(View view) {
        finishAffinity();
    }

}