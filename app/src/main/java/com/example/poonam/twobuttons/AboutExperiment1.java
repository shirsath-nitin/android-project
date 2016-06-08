package com.example.poonam.twobuttons;

/**
 * Created by poonam on 15/4/16.
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutExperiment1 extends Activity {
    Button btn5;
    private final String htmlText ="<body><h1><font size=6 color=#0000ff >Components:</font></h1><p><font size=4 color=#660000>1.1/2 cup 20-volume hydrogen peroxide liquid <br>(20-volume is a 6% solution, which can be found at a beauty <br>supply store or hair salon)</font>\n" +
            "<font size=4 color=#660000>2 Tablespoon of dry yeast</font><br>" +
            "<font size=4 color=#660000>3 Tablespoons of warm water</font><br>" +
            "<font size=4 color=#660000>4 Liquid dish washing soap</font><br>" +
            "<font size=4 color=#660000>5 Food coloring</font><br>" +
            "<font size=4 color=#660000>6 Bottles of all shapes</font><br> <br>" +
            "<img src=\"components2.jpg\"> +</body>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutexperiment);
        btn5=(Button) findViewById(R.id.button05);
        TextView htmlTextView = (TextView) findViewById(R.id.html_text);
        htmlTextView.setText(Html.fromHtml(htmlText, new ImageGetter(), null));

    }
    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, ListItemActivity2.class);
            startActivity(intent);
        }
    }

    private class ImageGetter implements Html.ImageGetter {

        public Drawable getDrawable(String source) {
            int id;
            if (source.equals("components2.jpg")) {
                id = R.drawable.components2;
            } else {
                return null;
            }

            Drawable d = getResources().getDrawable(id);
            d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
            return d;
        }
    } ;
}
