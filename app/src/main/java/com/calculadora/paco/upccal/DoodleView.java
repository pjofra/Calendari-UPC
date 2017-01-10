package com.calculadora.paco.upccal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class DoodleView extends ViewGroup {

    private static final int NUM_FILES = 6;
    private static final int NUM_COLUMNES = 5;
    private Paint _paintDoodle = new Paint ();


    public DoodleView(Context context) {
       this(context,null, 0);
    }
    public DoodleView (Context context, AttributeSet attrs) {
        this(context, attrs,0);
     }
    public DoodleView (Context context, AttributeSet attrs, int defStyle){
        super (context, attrs, defStyle);
        init (attrs,defStyle);
        crearFills(context);
    }

    private void crearFills(Context context) {
        for(int f=0; f<NUM_FILES; f++) {
            for(int c=0; c<NUM_COLUMNES; c++) {
                EditText e = new EditText(context);
                e.setText((f*NUM_COLUMNES+c));
                addView(e);
            }
        }
    }

    private void init(AttributeSet attrs, int defStyle){
        _paintDoodle.setColor(Color.BLACK);
        _paintDoodle.setAntiAlias(true);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize, heightSize;

        //Get the width based on the measure specs
        widthSize = getDefaultSize(0, widthMeasureSpec);

        //Get the height based on measure specs
        heightSize = getDefaultSize(0, heightMeasureSpec);

        //això d'aquí a baix el que fa és determinar la mida mínima per fer un quadrat (no necessari)

        //int majorDimension = Math.min(widthSize, heightSize);
        //Measure all child views
        //int blockDimension = majorDimension / mColumnCount;
        //int blockSpec = MeasureSpec.makeMeasureSpec(blockDimension,
         //       MeasureSpec.EXACTLY);
        //measureChildren(blockSpec, blockSpec);

        //MUST call this to save our own dimensions
        setMeasuredDimension(widthSize, heightSize);
    }
// aquí intento calcular la mida de les columnes
@Override
protected void onLayout(boolean changed, int l, int t, int r, int b) {
    int row, col, left, top;
    for (int i=0; i < getChildCount(); i++) {
        row = i / NUM_COLUMNES;
        col = i % NUM_COLUMNES;
        View child = getChildAt(i);
        left = col * child.getMeasuredWidth();
        top = row * child.getMeasuredHeight();

        child.layout(left,
                top,
                left + child.getMeasuredWidth(),
                top + child.getMeasuredHeight());
    }
}

    //aquesta funció hauria de dibuixar la quadrícula

    @Override
    protected void dispatchDraw(Canvas canvas) {
        //Let the framework do its thing
        super.dispatchDraw(canvas);
        Paint mGridPaint = new Paint();
        mGridPaint.setColor(0x000FF);
        //Draw the grid lines
        for (int i=0; i <= getWidth(); i += (getWidth() / NUM_COLUMNES)) {
            canvas.drawLine(i, 0, i, getHeight(), mGridPaint);
        }
        for (int i=0; i <= getHeight(); i += (getHeight() / NUM_COLUMNES)) {
            canvas.drawLine(0, i, getWidth(), i, mGridPaint);
        }
    }
}


