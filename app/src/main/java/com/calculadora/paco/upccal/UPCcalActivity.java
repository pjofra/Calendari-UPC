package com.calculadora.paco.upccal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


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


            }
        });

        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A1.getCodi(), Assignatura.A1.getNom(), Assignatura.A1.getCurs(), Assignatura.A1.getHoraris());
        doodle_view.setAssignatura(Assignatura.A2.getCodi(), Assignatura.A2.getNom(), Assignatura.A2.getCurs(), Assignatura.A2.getHoraris());
        doodle_view.setAssignatura(Assignatura.A3.getCodi(), Assignatura.A3.getNom(), Assignatura.A3.getCurs(), Assignatura.A3.getHoraris());
        //doodle_view.setAssignatura(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());


    }

    public void newSub (View v) {

        Intent myIntent = new Intent(UPCcalActivity.this, ConfigAssignatures.class);
        UPCcalActivity.this.startActivity(myIntent);


    }
    public void addSubject (int position){
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());
        Log.i("Lo ha petao", "ole");
    }



}
