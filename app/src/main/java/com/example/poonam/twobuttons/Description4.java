package com.example.poonam.twobuttons;

/**
 * Created by poonam on 22/4/16.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Description4 extends ActionBarActivity {
Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description4);
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
