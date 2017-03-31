package com.example.abc.bankverficationcenter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;

import static android.R.attr.name;


public class Transaction extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        this.imageView = (ImageView) this.findViewById(R.id.capture);
        Button btn1 = (Button) findViewById(R.id.capbtn);
        final EditText edname = (EditText) findViewById(R.id.edname);
        final EditText edamt =(EditText) findViewById(R.id.edamount);
        final EditText edleft =(EditText) findViewById(R.id.edleftamt);
        final EditText edcomment=(EditText) findViewById(R.id.edcomment);
        Button btnsubmit =(Button) findViewById(R.id.submitTrans);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);

            }
        });
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= edname.getText().toString();
                String amount = edamt.getText().toString();
                String left =edleft.getText().toString();
                String comment=edamt.getText().toString();
                if(TextUtils.isEmpty(username) && TextUtils.isEmpty(amount) && TextUtils.isEmpty(left) && TextUtils.isEmpty(comment)){
                    edname.setError("enter name");
                    edamt.setError("enter amount");
                    edleft.setError("enter amount to be left to pay");
                    edcomment.setError("enter comment");
                }


            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }
}


