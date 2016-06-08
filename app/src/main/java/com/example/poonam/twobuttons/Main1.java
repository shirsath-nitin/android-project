package com.example.poonam.twobuttons;

/**
 * Created by poonam on 15/4/16.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Main1 extends Activity {
    private ImageView hImageViewPic;
    private Button iButton, gButton;
    Button btn5;
    private int currentImage = 0;
    int[] images = { R.drawable.step21, R.drawable.step22, R.drawable.step23,R.drawable.step24,R.drawable.step25, R.drawable.step26,R.drawable.step27,R.drawable.step28,R.drawable.step29,R.drawable.step210};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main6);
        btn5=(Button) findViewById(R.id.button05);
        hImageViewPic = (ImageView)findViewById(R.id.idImageViewPic);
        iButton = (Button) findViewById(R.id.bIleri);
        gButton = (Button) findViewById(R.id.bGeri);
        //Just set one Click listener for the image

        iButton.setOnClickListener(iButtonChangeImageListener);
        gButton.setOnClickListener(gButtonChangeImageListener);
    }
    View.OnClickListener iButtonChangeImageListener = new View.OnClickListener() {

        public void onClick(View v) {
            //Increase Counter to move to next Image
            currentImage++;
            currentImage = currentImage % images.length;

            hImageViewPic.setImageResource(images[currentImage]);

        }
    };

    View.OnClickListener gButtonChangeImageListener = new View.OnClickListener() {

        public void onClick(View v) {
            //Increase Counter to move to next Image
            currentImage--;
            currentImage = (currentImage + images.length) % images.length;

            hImageViewPic.setImageResource(images[currentImage]);

        }
    };
    public void onClick(View v) {
        final Context context = this;
        if (v.getId() == R.id.button05) {
            Intent intent = new Intent(context, ListItemActivity2.class);
            startActivity(intent);
        }
    }
}