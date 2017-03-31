package com.example.abc.bankverficationcenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ABC on 10-Mar-17.
 */
public class CustomAdapter extends ArrayAdapter<String>{
    String[] str;
    Context context;


    public CustomAdapter(Context context, int resource, String[] str) {
        super(context, resource, str);
        this.context=context;
        this.str=str;


    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.customrow,parent,false);
        TextView custxt=(TextView) convertView.findViewById(R.id.textcustom);
        custxt.setText(str[position]);



        return convertView;
    }
}
