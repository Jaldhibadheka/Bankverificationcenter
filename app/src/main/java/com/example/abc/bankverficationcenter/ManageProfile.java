package com.example.abc.bankverficationcenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ManageProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        final EditText edname=(EditText)findViewById(R.id.Firsttxt);
        final EditText edLname=(EditText)findViewById(R.id.Lasttxt);
        final EditText edemail=(EditText)findViewById(R.id.mailtxt);
        final EditText edcnt=(EditText)findViewById(R.id.contacttxt);
        Button btnsubmit =(Button)findViewById(R.id.sub1btn);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edname.getText().toString();
                String lname=edLname.getText().toString();
                String mail=edemail.getText().toString();
                String cnt=edcnt.getText().toString();
                if(TextUtils.isEmpty(name) && TextUtils.isEmpty(lname) && TextUtils.isEmpty(mail) && TextUtils.isEmpty(cnt)){
                    edname.setError("enter name");
                    edLname.setError("enter lastname");
                    edemail.setError("enter email");
                    edcnt.setError("enter contact no");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        } else if (id == R.id.log) {
            Intent clk = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(clk);
        }
        return super.onOptionsItemSelected(item);
    }




}
