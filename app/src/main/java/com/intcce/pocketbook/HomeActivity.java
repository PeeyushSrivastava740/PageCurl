package com.intcce.pocketbook;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anilokcun.uwmediapicker.UwMediaPicker;

public class HomeActivity extends AppCompatActivity {

    Button btnLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        initView();
        setViewClick();
    }

    private void setViewClick() {

    }

    private void initView() {
        btnLoad = findViewById(R.id.btnLoad);
    }
}