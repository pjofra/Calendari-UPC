package com.calculadora.paco.upccal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class UPCcalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upccal);
    }

    public void onClick (View v) {
        Button reset_button = (Button)v;
        ((Button) v).setText("clicked");

    }

}
