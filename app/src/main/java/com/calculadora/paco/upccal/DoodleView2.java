package com.calculadora.paco.upccal;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View.OnClickListener;


public class DoodleView2 extends ViewGroup implements View.OnClickListener
{
    private static final int NUM_FILES = 6;
    private static final int NUM_COLUMNES = 5;

    private Button[][] caselles;

    public DoodleView2(Context context) {
        this(context,null, 0);
    }
    public DoodleView2 (Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }
    public DoodleView2 (Context context, AttributeSet attrs, int defStyle){
        super (context, attrs, defStyle);
        init (attrs,defStyle);
        crearFills(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int itemWidth = (r-l)/NUM_COLUMNES;
        int itemHeigth = (b-t)/NUM_FILES;
        for(int f=0; f<NUM_FILES; f++) {
            for(int c=0; c<NUM_COLUMNES; c++) {
                caselles[f][c].layout(itemWidth*c,itemHeigth*f,itemWidth*(c+1),itemHeigth*(f+1));
            }
        }
        Log.d("Debug:","itemWidth:" +itemWidth);
        Log.d("Debug:","itemHeigth:" +itemHeigth);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int wspec = MeasureSpec.makeMeasureSpec(getMeasuredWidth()/NUM_COLUMNES,MeasureSpec.EXACTLY);
        int hspec = MeasureSpec.makeMeasureSpec(getMeasuredHeight()/NUM_FILES,MeasureSpec.EXACTLY);
        for(int f=0; f<NUM_FILES; f++) {
            for(int c=0; c<NUM_COLUMNES; c++) {
                caselles[f][c].measure(wspec,hspec);
            }
        }
    }

    private void init(AttributeSet attrs, int defStyle){
     //  _paintDoodle.setColor(Color.BLACK);
      //  _paintDoodle.setAntiAlias(true);
    }

    private void crearFills(Context context) {
        caselles = new Button[NUM_FILES][NUM_COLUMNES];
        for(int f=0; f<NUM_FILES; f++) {
            for(int c=0; c<NUM_COLUMNES; c++) {
                caselles[f][c] = new Button(context, null, android.R.attr.borderlessButtonStyle);
                caselles[f][c].setTextColor(Color.parseColor("white"));
                caselles[f][c].setBackgroundColor(Color.WHITE);
                caselles[f][c].setOnClickListener(this);
                addView(caselles[f][c]);
            }
        }

    }


    void setAssignatura(int codi, String nom, int curs, int[] horaris) {
        for (int n = 0; n < horaris.length; n++) {
            int i= 0; // horaris[i]
            int j = 0;
            caselles[horaris [0]][horaris [1]].setBackgroundColor(Color.RED);
            caselles[horaris [0]][horaris [1]].setText(nom);

        }
    }

    void setEsborrar(boolean reset) {

        if (reset){
            for(int f=0; f<NUM_FILES; f++) {
                for(int c=0; c<NUM_COLUMNES; c++) {
                    caselles[f][c].setBackgroundColor(Color.WHITE);
        }

        }
    }}

    @Override
    public void onClick(View v) {
        Button b = (Button)v;
        int i = 0;
        int j =0;
        for (int x = 0; x < NUM_FILES; x++) {
            for (int y = 0; y < NUM_COLUMNES; y++) {
                if (caselles[x][y] == v) {
                    i = x;
                    j = y;

                }
            }
        }
        final int p = i;
        final int a = j;

        Log.i("button", String.format("Resposta: ", b));
            // variable per aconseguir el text del botó ///// String buttonText = b.getText().toString();

        //ColorDrawable buttonColor = (ColorDrawable) caselles[p][a].getBackground();
        //int colorID = buttonColor.getColor();
        //if (colorID == R.color.WHITE) {}

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(v.getContext());

            alertDialogBuilder.setTitle("Què vols fer?");

            alertDialogBuilder
                    .setMessage("Pots canviar o eliminar l'assignatura o tornar al calendari")
                    .setCancelable(false)
                    .setPositiveButton("Eliminar",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            Log.i("Estem intentant: ", "eliminar assignatura");
                            Log.i("button", String.format("Resposta: %d", id));
                            caselles[p][a].setBackgroundColor(Color.WHITE);
                            caselles[p][a].setText(" ");
                        }
                    })
                    .setNegativeButton("Canviar",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            Log.i("Estem intentant: ", "canviar assignatura");
                            //s'ha d'escriure aquí per cridar a ConfigAssginatura

                        }
                    })
                    .setNeutralButton("Sortir",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            // simplement es tanca
                            dialog.cancel();
                        }
                    });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
        }
}






