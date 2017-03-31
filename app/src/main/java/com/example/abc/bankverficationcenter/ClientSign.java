package com.example.abc.bankverficationcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ClientSign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_sign);
        TextView txt1=(TextView)findViewById(R.id.creg);

        final EditText ed1=(EditText)findViewById(R.id.Ftxt);
        final EditText ed2=(EditText)findViewById(R.id.Ltxt);
        final EditText ed3=(EditText)findViewById(R.id.emailtxt);
        EditText ed4=(EditText)findViewById(R.id.Ptxt);
        RadioButton rd1=(RadioButton)findViewById(R.id.Mtxt);
        RadioButton rd2=(RadioButton)findViewById(R.id.Femaletxt);
        EditText ed5=(EditText)findViewById(R.id.Contacttxt);
        Button btn1=(Button) findViewById(R.id.sub1btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null && ed2 ==null && ed3==null){
                    ed1.setText("enter fname");
                    ed2.setText("enter lname");
                    ed3.setText("enter email");
                }
            }
        });

    }
}
