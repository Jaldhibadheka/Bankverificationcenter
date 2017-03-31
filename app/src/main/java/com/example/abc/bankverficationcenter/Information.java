package com.example.abc.bankverficationcenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Button avil =(Button)findViewById(R.id.available);
        avil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(Information.this,Transaction.class);
                startActivity(i1);
            }
        });
        Button navail =(Button) findViewById(R.id.notavailable);
        navail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(Information.this,NotAvailableCustomer.class);
                startActivity(i2);
            }
        });
        Button forward =(Button) findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 =new Intent(Information.this,PostponeCust.class);
                startActivity(i3);

            }
        });
    }
}
