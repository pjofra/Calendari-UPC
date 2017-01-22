package com.calculadora.paco.upccal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class ConfigAssignatures extends AppCompatActivity {


    private int ids_years[] = {R.id.year1, R.id.year2, R.id.year3, R.id.year4};

    //public Assignatura assignatura1[] = {1, 25, 56, 57};


    /*private ArrayList<Assignatura> readList() {
        ArrayList<Assignatura> assignatura2 = new ArrayList<Assignatura>();
        assignatura2.add(new Assignatura(0, "Assig1", 5, new int[]{45, 56, 67}));
        return null;

    }*/

    //private int assignatura1[] = {1, 25, 56, 57};


   // private ArrayList<Assignatura> readList() {
  //      ArrayList<Assignatura> assignatura2 = new ArrayList<Assignatura>();
    //    assignatura2.add(new Assignatura(0, "Assig1", 5, new int[]{45, 56, 67}));
     //   return null;

    //}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_assignatures);

        populateListView();

        //String[] answers = getResources().getStringArray(R.array.year);
    }

    public void registerClickCallback() {
    }
    public void populateListView() {

        Button button_add = (Button) findViewById(R.id.button_add);

        final RadioGroup year = (RadioGroup) findViewById(R.id.year);
        int ids_years[] = {R.id.year1, R.id.year2, R.id.year3, R.id.year4};
        final int[] curs = new int[1];

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year_selected = year.getCheckedRadioButtonId();

                //Log.i("hem triat el curs:", String.valueOf(year_selected));
                //Log.i("Button 1:", String.valueOf(R.id.year1));
                //Log.i("Button 2:", String.valueOf(R.id.year2));
                //Log.i("Button 3:", String.valueOf(R.id.year3));
                //Log.i("Button 4:", String.valueOf(R.id.year4));
                if (year_selected == R.id.year1)   {
                    curs[0] = 1;
                    Log.i("Coincideix amb el curs", String.valueOf(curs[0]));
                }
                if (year_selected == R.id.year2)   {
                    curs[0] = 2;
                    Log.i("Coincideix amb el curs", String.valueOf(curs[0]));
                }
                if (year_selected == R.id.year3)   {
                    curs[0] = 3;
                    Log.i("Coincideix amb el curs", String.valueOf(curs[0]));
                }
                if (year_selected == R.id.year4)   {
                    curs[0] =4;
                    Log.i("Coincideix amb el curs", String.valueOf(curs[0]));
                }

            }
        });


        String[] myItem = {Assignatura.A1.getNom(), Assignatura.A2.getNom(),Assignatura.A3.getNom(),Assignatura.A4.getNom(),Assignatura.A5.getNom(),Assignatura.A6.getNom(),Assignatura.A7.getNom(),};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_item, myItem);

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
    }


}
