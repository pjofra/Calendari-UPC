package com.calculadora.paco.upccal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View.OnClickListener;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class UPCcalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upccal);


        Button button_reset = (Button) findViewById(R.id.button_reset);

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("S'ha apretat el button:", " reset");
                DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
                doodle_view.setEsborrar(true);
                //Aqui funciona ja que en surt a l'android monitor
            }
        });

        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(001, "hola", 1, new int[]{3,3});
        doodle_view.setAssignatura(002, "adeu", 1, new int[]{4,4});
    }

    public void newSub (View v) {
        Intent myIntent = new Intent(UPCcalActivity.this, ConfigAssignatures.class);
        UPCcalActivity.this.startActivity(myIntent);

    }

    public void reset (View v) {

        // aquí hem d'escriure funció per esborrar tota la taula


    }




}
