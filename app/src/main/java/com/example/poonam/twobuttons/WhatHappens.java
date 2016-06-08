package com.example.poonam.twobuttons;

/**
 * Created by poonam on 10/4/16.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class WhatHappens extends ActionBarActivity {
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main5);
        btn5=(Button) findViewById(R.id.button05);
    }
    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, DifferentActivity.class);
            startActivity(intent);
        }
    }
}
