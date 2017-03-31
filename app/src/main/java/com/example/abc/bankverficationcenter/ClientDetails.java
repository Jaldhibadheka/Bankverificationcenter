package com.example.abc.bankverficationcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ClientDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_details);
        EditText edname=(EditText) findViewById(R.id.cname);
        EditText edadd =(EditText) findViewById(R.id.cadd);
        EditText edamt =(EditText) findViewById(R.id.Damt);
        EditText edcnt =(EditText) findViewById(R.id.mobnum);

    }
}
