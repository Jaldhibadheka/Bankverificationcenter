package com.example.abc.bankverficationcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ClientList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_list);
        String[] client=getResources().getStringArray(R.array.clientlist);

        CustomAdapter cs= new CustomAdapter(this,R.layout.customrow,client);
        ListView list=(ListView) findViewById(R.id.list1);
        list.setAdapter(cs);

    }
}
