package com.example.poonam.twobuttons;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by poonam on 22/4/16.
 */
public class WhatHappens3 extends ActionBarActivity {
Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. whathappens3);
        btn5=(Button) findViewById(R.id.button05);
    }
    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, ListItemActivity4.class);
            startActivity(intent);
        }
    }
}
