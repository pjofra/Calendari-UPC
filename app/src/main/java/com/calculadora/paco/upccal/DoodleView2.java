package com.calculadora.paco.upccal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Roger on 23/12/2016.
 */

public class DoodleView2 extends ViewGroup implements View.OnClickListener
{
    private static final int NUM_FILES = 6;
    private static final int NUM_COLUMNES = 5;

    private Paint _paintDoodle = new Paint ();

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
//        _paintDoodle.setColor(Color.BLACK);
//        _paintDoodle.setAntiAlias(true);
    }

    private void crearFills(Context context) {
        caselles = new Button[NUM_FILES][NUM_COLUMNES];
        for(int f=0; f<NUM_FILES; f++) {
            for(int c=0; c<NUM_COLUMNES; c++) {
                caselles[f][c] = new Button(context, null, android.R.attr.borderlessButtonStyle);
                caselles[f][c].setTextColor(Color.parseColor("white"));
                //caselles[f][c].setText("hola " + (f*NUM_COLUMNES+c));
                caselles[f][c].setOnClickListener(this);
                caselles[f][c].setBackgroundColor(Color.parseColor("#dbdbdb"));
                addView(caselles[f][c]);
            }
        }
        caselles[1][2].setBackgroundColor(Color.RED);
        caselles[1][2].setText("Mates 1 ");
        caselles[2][2].setBackgroundColor(Color.RED);
        caselles[2][2].setText("Mates 1 ");
    }

    //funció per detectar si funcionaven els butons
    @Override
    public void onClick(View v) {
        Button b = (Button)v;
        Log.i("botons", String.format("Has clicat %s", b.getText().toString()));
    }



}
