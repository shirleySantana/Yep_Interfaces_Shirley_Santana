package com.example.shirley.prueba_interfaces_shirley_santana;

/**
 * Created by ShirleyGirbelis on 8/03/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash_Screen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        TextView myTitle = (TextView)findViewById(R.id.textView4);
        TextView mySubtitle = (TextView)findViewById(R.id.textView3);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        myTitle.startAnimation(shake);
        mySubtitle.startAnimation(shake);
        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen
                        .this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }

}