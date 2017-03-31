package com.example.abc.bankverficationcenter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import static com.example.abc.bankverficationcenter.R.id.imageView;

public class NotAvailableCustomer extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_available_customer);

        Spinner notavail =(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,R.array.notavailable,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        notavail.setAdapter(arrayAdapter);

        Spinner status =(Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> dataAdapter =ArrayAdapter.createFromResource(this,R.array.status,android.R.layout.simple_spinner_item);
        status.setAdapter(dataAdapter);

        imageView= (ImageView) findViewById(R.id.photoimg);
        Button capture =(Button) findViewById(R.id.photo);
        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });}
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }

    }

