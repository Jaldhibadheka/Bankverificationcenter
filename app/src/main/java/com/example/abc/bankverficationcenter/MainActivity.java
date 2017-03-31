package com.example.abc.bankverficationcenter;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final TextView txt1=(TextView)findViewById(R.id.logtxt);
         final EditText ed1=(EditText)findViewById(R.id.usertxt);
         final EditText ed2=(EditText)findViewById(R.id.passtxt);
        Button btn1=(Button)findViewById(R.id.subbtn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username =ed1.getText().toString();
                String password = ed2.getText().toString();
                if(TextUtils.isEmpty(username) && TextUtils.isEmpty(password)){
                    ed1.setError("enter username");
                    ed2.setError("enter password");
                }
                else{
                    Intent clk =new Intent(MainActivity.this,Navigation.class);
                    startActivity(clk);
                }
            }
        });
        TextView txt2=(TextView) findViewById(R.id.signup);
        TextView txt3=(TextView) findViewById(R.id.forgot);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ClientSign.class);
                startActivity(i);
            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,Information.class);
                startActivity(i1);
            }
        });


    }
}
