package com.example.poonam.twobuttons;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by poonam on 14/4/16.
 */
public class ListItemActivity2 extends Activity {

    Button btn1,btn4,btn2,btn3,btn5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        btn1 = (Button) findViewById(R.id.buttonUrl);
        btn4 = (Button) findViewById(R.id.button03);
        btn2 = (Button) findViewById(R.id.button01);
        btn3= (Button) findViewById(R.id.button04);
        btn5=(Button) findViewById(R.id.button05);
       
    }

    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.buttonUrl) {
            Intent intent = new Intent(context, Main1.class);
            startActivity(intent);

        }  else if (v.getId() == R.id.button03) {
            Intent intent = new Intent(context, WhatHappens1.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.button01) {
            Intent intent = new Intent(context, AboutExperiment1.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.button04) {
            Intent intent = new Intent(context, Description1.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, AndroidListViewActivity.class);
            startActivity(intent);
        }
        }
    }
