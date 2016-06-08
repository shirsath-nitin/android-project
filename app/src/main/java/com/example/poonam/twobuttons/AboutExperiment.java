package com.example.poonam.twobuttons;

/**
 * Created by poonam on 11/4/16.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutExperiment extends Activity {
    Button btn5;
    private final String htmlText ="<body><h1><font size=6 color=#0000ff >Components:</font></h1><p><font size=4 color=#660000>1.Candle</font><br>" +
            "<font size=4 color=#660000>2 Water</font><br>" +
            "<font size=4 color=#660000>3 Tray</font><br>" +
            "<font size=4 color=#660000>4 cup to conduct this cool little trick</font><br>" +
            "<img src=\"components.jpg\"> +</body>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        btn5=(Button) findViewById(R.id.button05);

        TextView htmlTextView = (TextView) findViewById(R.id.html_text);
        htmlTextView.setText(Html.fromHtml(htmlText, new ImageGetter(), null));

    }
    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, DifferentActivity.class);
            startActivity(intent);
        }
    }

    private class ImageGetter implements Html.ImageGetter {

        public Drawable getDrawable(String source) {
            int id;
            if (source.equals("components.jpg")) {
                id = R.drawable.components;
            } else {
                return null;
            }

            Drawable d = getResources().getDrawable(id);
            d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
            return d;
        }
    } ;

}