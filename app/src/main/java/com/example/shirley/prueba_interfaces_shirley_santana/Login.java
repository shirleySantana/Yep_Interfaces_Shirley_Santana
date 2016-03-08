package com.example.shirley.prueba_interfaces_shirley_santana;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        TextView myTitle = (TextView)findViewById(R.id.textView);
        TextView mySubtitle = (TextView)findViewById(R.id.textView2);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);

    }
    public  void onClickLogin(View view){
        Intent intent = new Intent(Login.this, Entrar.class);
        startActivity(intent);

    }

}
