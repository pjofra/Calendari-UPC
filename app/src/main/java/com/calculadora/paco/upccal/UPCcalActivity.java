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


    public void Termo (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        boolean potsPintar = doodle_view.potsPintar(Assignatura.A1.getCodi(), Assignatura.A1.getNom(), Assignatura.A1.getCurs(), Assignatura.A1.getHoraris());
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

    }

    public void Eco (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A3.getCodi(), Assignatura.A3.getNom(), Assignatura.A3.getCurs(), Assignatura.A3.getHoraris());

    }


    public void Fluids (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A5.getCodi(), Assignatura.A5.getNom(), Assignatura.A5.getCurs(), Assignatura.A5.getHoraris());

    }

    public void Materials (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A6.getCodi(), Assignatura.A6.getNom(), Assignatura.A6.getCurs(), Assignatura.A6.getHoraris());

    }

    public void PMA (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        boolean potsPintar = doodle_view.potsPintar(Assignatura.A7.getCodi(), Assignatura.A7.getNom(), Assignatura.A7.getCurs(), Assignatura.A7.getHoraris());
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
        doodle_view.setAssignatura(Assignatura.A7.getCodi(), Assignatura.A7.getNom(), Assignatura.A7.getCurs(), Assignatura.A7.getHoraris());

    }

    public void Resis (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A8.getCodi(), Assignatura.A8.getNom(), Assignatura.A8.getCurs(), Assignatura.A8.getHoraris());

    }
    public void Elasticitat (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A9.getCodi(), Assignatura.A9.getNom(), Assignatura.A9.getCurs(), Assignatura.A9.getHoraris());

    }

    public void Fisica (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A10.getCodi(), Assignatura.A10.getNom(), Assignatura.A10.getCurs(), Assignatura.A10.getHoraris());

    }

    public void Quimica (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A11.getCodi(), Assignatura.A11.getNom(), Assignatura.A11.getCurs(), Assignatura.A11.getHoraris());

    }
    public void Mecanica (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        boolean potsPintar = doodle_view.potsPintar(Assignatura.A12.getCodi(), Assignatura.A12.getNom(), Assignatura.A12.getCurs(), Assignatura.A12.getHoraris());
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
        doodle_view.setAssignatura(Assignatura.A12.getCodi(), Assignatura.A12.getNom(), Assignatura.A12.getCurs(), Assignatura.A12.getHoraris());

    }
    public void TMM (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A13.getCodi(), Assignatura.A13.getNom(), Assignatura.A13.getCurs(), Assignatura.A13.getHoraris());

    }
    public void Grafica (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A14.getCodi(), Assignatura.A14.getNom(), Assignatura.A14.getCurs(), Assignatura.A14.getHoraris());

    }
    public void CAD (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A15.getCodi(), Assignatura.A15.getNom(), Assignatura.A15.getCurs(), Assignatura.A15.getHoraris());

    }
    public void MOP (View v) {
        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
        doodle_view.setAssignatura(Assignatura.A16.getCodi(), Assignatura.A16.getNom(), Assignatura.A16.getCurs(), Assignatura.A16.getHoraris());

    }



//    public void addSubject (int position){
//        DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
//        doodle_view.setAssignatura(Assignatura.A4.getCodi(), Assignatura.A4.getNom(), Assignatura.A4.getCurs(), Assignatura.A4.getHoraris());
//        Log.i("Lo ha petao", "ole");
//    }



}
