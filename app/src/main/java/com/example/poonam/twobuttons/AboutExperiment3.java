package com.example.poonam.twobuttons;

/**
 * Created by poonam on 22/4/16.
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

public class AboutExperiment3 extends Activity {
    Button btn5;
    private final String htmlText ="<body><h1><font size=6 color=#0000ff >Components:</font></h1><p><font size=4 color=#660000>\n" +
            "\n" +
            "    Half a lemon,\n" +
            "    Water,\n" +
            "    Spoon,\n" +
            "    Bowl,\n" +
            "    Cotton bud,\n" +
            "    White paper,\n" +
            "    Lamp or other light bulb\n" +
            "\n</font><br>"+
            "<img src=\"components4.jpg\"> +</body>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutexperiment3);
        btn5=(Button) findViewById(R.id.button05);
        TextView htmlTextView = (TextView) findViewById(R.id.html_text);
        htmlTextView.setText(Html.fromHtml(htmlText, new ImageGetter(), null));

    }
    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, ListItemActivity4.class);
            startActivity(intent);
        }
    }

    private class ImageGetter implements Html.ImageGetter {

        public Drawable getDrawable(String source) {
            int id;
            if (source.equals("components4.jpg")) {
                id = R.drawable.components4;
            } else {
                return null;
            }

            Drawable d = getResources().getDrawable(id);
            d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
            return d;
        }
    } ;
}