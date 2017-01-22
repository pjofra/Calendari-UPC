package com.calculadora.paco.upccal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class UPCcalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upccal);


        Button button_reset = (Button) findViewById(R.id.button_reset);
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setEsborrar(true);
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("S'ha apretat el button:", " reset");
                DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
                doodle_view.setEsborrar(true);


            }
        });

        //DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
//        doodle_view.setAssignatura(Assignatura.A1.getCodi(), Assignatura.A1.getNom(), Assignatura.A1.getCurs(), Assignatura.A1.getHoraris());
        //doodle_view.setAssignatura(Assignatura.A2.getCodi(), Assignatura.A2.getNom(), Assignatura.A2.getCurs(), Assignatura.A2.getHoraris());
        //doodle_view.setAssignatura(Assignatura.A3.getCodi(), Assignatura.A3.getNom(), Assignatura.A3.getCurs(), Assignatura.A3.getHoraris());
        //doodle_view.setAssignatura(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());


    }

    public void newSub (View v) {

        Intent myIntent = new Intent(UPCcalActivity.this, ConfigAssignatures.class);
        UPCcalActivity.this.startActivity(myIntent);
    }

    public void Termo (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        boolean potsPintar = doodle_view.potsPintar(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());
        if (potsPintar){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(v.getContext(),R.style.AlertDialogCustom);

            alertDialogBuilder.setTitle("Has solapat una assignatura!");

            alertDialogBuilder
                    .setCancelable(false)
                    .setNeutralButton("                        Ok",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            // simplement es tanca
                            dialog.cancel();
                        }
                    });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
            Log.i("Esto es un true", "como una catedral");
        }
        else
            Log.i("Esto es un false", "como barcenas");
        doodle_view.setAssignatura(Assignatura.A1.getCodi(), Assignatura.A1.getNom(), Assignatura.A1.getCurs(), Assignatura.A1.getHoraris());
    }

    public void Mates (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        boolean potsPintar = doodle_view.potsPintar(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());
        if (potsPintar){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(v.getContext(),R.style.AlertDialogCustom);

            alertDialogBuilder.setTitle("Has solapat una assignatura!");

            alertDialogBuilder
                    .setCancelable(false)
                    .setNeutralButton("                        Ok",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            // simplement es tanca
                            dialog.cancel();
                        }
                    });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
            Log.i("Esto es un true", "como una catedral");
        }
        else
            Log.i("Esto es un false", "como barcenas");
        doodle_view.setAssignatura(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());

    }

    public void Dibuix (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A2.getCodi(), Assignatura.A2.getNom(), Assignatura.A2.getCurs(), Assignatura.A2.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }

    public void Eco (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A3.getCodi(), Assignatura.A3.getNom(), Assignatura.A3.getCurs(), Assignatura.A3.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }


    public void Fluids (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A5.getCodi(), Assignatura.A5.getNom(), Assignatura.A5.getCurs(), Assignatura.A5.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }

    public void Materials (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A6.getCodi(), Assignatura.A6.getNom(), Assignatura.A6.getCurs(), Assignatura.A6.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }

    public void PMA (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A7.getCodi(), Assignatura.A7.getNom(), Assignatura.A7.getCurs(), Assignatura.A7.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }

    public void Resis (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A8.getCodi(), Assignatura.A8.getNom(), Assignatura.A8.getCurs(), Assignatura.A9.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }
    public void Elasticitat (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A9.getCodi(), Assignatura.A9.getNom(), Assignatura.A9.getCurs(), Assignatura.A9.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }

    public void Fisica (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A10.getCodi(), Assignatura.A10.getNom(), Assignatura.A10.getCurs(), Assignatura.A10.getHoraris());
        //boolean potsPintar = doodle_view.potsPintar();
        //if (potsPintar){

        //}
        //else
        // Log.i("Lo ha petao", "ole");
    }




    public void addSubject (int position){
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());
        Log.i("Lo ha petao", "ole");
    }



}
