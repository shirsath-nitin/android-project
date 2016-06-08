package com.example.poonam.twobuttons;

/**
 * Created by poonam on 14/4/16.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main extends Activity {
    private ImageView hImageViewPic;
    private Button iButton, gButton;
    Button btn5;

    private int currentImage = 0;
    int[] images = { R.drawable.step1, R.drawable.step2, R.drawable.step3,R.drawable.step4,R.drawable.step5 };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
            Intent intent = new Intent(context, DifferentActivity.class);
            startActivity(intent);
        }       
    }
}