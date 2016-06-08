package com.example.poonam.twobuttons;

/**
 * Created by poonam on 14/4/16.
 */
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class AndroidListViewActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


// storing string resources into Array

        String[] adobe_products =
                getResources().getStringArray(R.array.adobe_products);
// Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, adobe_products));
        ListView lv = getListView();
        getListView().setBackgroundResource(R.drawable.chem1);
// listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// selected item
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), DifferentActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity4.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

    }

}
