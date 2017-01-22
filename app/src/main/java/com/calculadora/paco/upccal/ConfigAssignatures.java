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

        Button button_add = (Button) findViewById(R.id.button_add);

        final RadioGroup year = (RadioGroup) findViewById(R.id.year);

        //String[] answers = getResources().getStringArray(R.array.year);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year_selected = year.getCheckedRadioButtonId();

                Log.i("hem triat el curs:", String.valueOf(year_selected));
                //Log.i("Primera assignatura:", String.valueOf(assignatura1[1]));
                //AQUI TREIEM EL ID DEL BUTO DE L'ANY QUE HEM TRIAT, AIXO HO FAREM SERVIR PER DESPRES SELECCIONAR DEL TXT

            }
        });
    }

    public void registerClickCallback() {
    }

    public void populateListView() {

        Assignatura.A1.getNom();

        String[] myItem = {Assignatura.A1.getNom(), Assignatura.A2.getNom(),Assignatura.A3.getNom(),Assignatura.A4.getNom(),Assignatura.A5.getNom(),Assignatura.A6.getNom(),Assignatura.A7.getNom(),};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_item, myItem);

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
    }


}
