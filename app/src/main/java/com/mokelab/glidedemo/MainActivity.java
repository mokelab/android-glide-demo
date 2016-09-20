package com.mokelab.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://mokelab.com/assets/img/moke_normal.png";

        ImageView image = (ImageView) findViewById(R.id.image);
        Glide.with(this).load(url).into(image);
    }
}
