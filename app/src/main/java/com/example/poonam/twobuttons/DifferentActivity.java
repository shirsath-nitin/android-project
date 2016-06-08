package com.example.poonam.twobuttons;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class DifferentActivity extends Activity {

    Button btn1,btn4,btn2,btn3,btn5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_different);
        btn1 = (Button) findViewById(R.id.buttonUrl);
        btn4 = (Button) findViewById(R.id.button03);
        btn2 = (Button) findViewById(R.id.button01);
        btn3=(Button) findViewById(R.id.button04);
        btn5=(Button) findViewById(R.id.button05);
    }

    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.buttonUrl) {
            Intent intent = new Intent(context, Main.class);
            startActivity(intent);

        }  else if (v.getId() == R.id.button03) {
            Intent intent = new Intent(context, WhatHappens.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.button01) {
            Intent intent = new Intent(context, AboutExperiment.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.button04) {
            Intent intent = new Intent(context, Description2.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, AndroidListViewActivity.class);
            startActivity(intent);
        }
        }
    }