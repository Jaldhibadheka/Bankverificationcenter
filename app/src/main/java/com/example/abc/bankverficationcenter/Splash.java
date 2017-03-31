package com.example.abc.bankverficationcenter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    private  final int splash_display_length=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent mainintent=new Intent(Splash.this,MainActivity.class);
                Splash.this.startActivity(mainintent);
                Splash.this.finish();
            }
                                  },splash_display_length);



    }
}
