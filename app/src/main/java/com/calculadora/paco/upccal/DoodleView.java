package com.calculadora.paco.upccal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by paco on 2/12/16.
 */

public class DoodleView extends View{


    private Paint _paintDoodle = new Paint ();


    public DoodleView(Context context) {
        super(context);
        init (null, 0);
    }
    public DoodleView (Context context, AttributeSet attrs) {
        super (context, attrs);
        init (attrs,0);
    }
    public DoodleView (Context context, AttributeSet attrs, int defStyle){
        super (context, attrs, defStyle);
        init (attrs,defStyle);
    }

    private void init(AttributeSet attrs, int defStyle){
        _paintDoodle.setColor(Color.BLACK);
        _paintDoodle.setAntiAlias(true);
    }

    @Override
    public void onDraw (Canvas canvas){
        super.onDraw(canvas);

        canvas.drawLine (0,0, getWidth(),getHeight(), _paintDoodle);
    }
}
