package com.calculatorui.calculator;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt =(TextView) findViewById(R.id.display_port);
        Typeface font = Typeface.createFromAsset(getAssets(), "digital-7.ttf");
        txt.setTypeface(font);
    }

    public void buttonClicked(View view) {

    }

}

