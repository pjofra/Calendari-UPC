package com.calculadora.paco.upccal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class ConfigAssignatures extends AppCompatActivity {


    /*public Assignatura assignatura1[] = {1, 25, 56, 57};


    private ArrayList<Assignatura> readList() {
        ArrayList<Assignatura> assignatura2 = new ArrayList<Assignatura>();
        assignatura2.add(new Assignatura(0, "Assig1", 5, new int[]{45, 56, 67}));
        return null;
    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_assignatures);
        populateListView();

    }

    /*  public void registerClickCallback() {
      }
  */
    public void populateListView() {

        Button button_add = (Button) findViewById(R.id.button_add);

        final RadioGroup year = (RadioGroup) findViewById(R.id.year);

        //int ids_years[] = {R.id.year1, R.id.year2, R.id.year3, R.id.year4};
        final int[] curs = new int[1];

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year_selected = year.getCheckedRadioButtonId();

                if (R.id.year1 == year_selected)   {curs[0] = 1;}
                if (R.id.year2 == year_selected)   {curs[0] = 2;}
                if (R.id.year3 == year_selected)   {curs[0] = 3;}
                if (R.id.year4 == year_selected)   {curs[0] = 4;}

                Log.i("Coincideix amb el curs", String.valueOf(curs[0]));

            }
        });

/*
        if (curs[0] == 1)   { String[] myItem = {Assignatura.A1.getNom(), Assignatura.A2.getNom(),Assignatura.A3.getNom(),};
            Log.i("hem entrar a l'if del curs", "1");
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_item, myItem);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);}

        else { String[] myItem = {Assignatura.A1.getNom(), Assignatura.A2.getNom(),Assignatura.A3.getNom(),Assignatura.A4.getNom(),Assignatura.A5.getNom(),};
            Log.i("hem entrar a l'if del curs", "15");
            Log.i("Coincideix amb el curs", String.valueOf(curs[0]));
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_item, myItem);
            ListView list = (ListView) findViewById(R.id.listView);
            list.setAdapter(adapter);}


        if (curs[0] == 2)   {  String[] myItem = {Assignatura.A4.getNom(), Assignatura.A5.getNom(),Assignatura.A6.getNom(),};
            Log.i("hem entrar a l'if del curs", "2");
            Log.i("Coincideix amb el curs", String.valueOf(curs[0]));
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_item, myItem);
            ListView list = (ListView) findViewById(R.id.listView);
            list.setAdapter(adapter);}

        else { String[] myItem = {Assignatura.A1.getNom(), Assignatura.A2.getNom(),Assignatura.A3.getNom(),Assignatura.A4.getNom(),Assignatura.A5.getNom(),};
            Log.i("hem entrar a l'if del curs", "15");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_item, myItem);
            ListView list = (ListView) findViewById(R.id.listView);
            list.setAdapter(adapter);}*/


        String[] myItem = {Assignatura.A4.getNom(),Assignatura.A5.getNom(),Assignatura.A6.getNom(),Assignatura.A7.getNom(), Assignatura.A8.getNom(), Assignatura.A9.getNom(), Assignatura.A10.getNom(),  };

        //afegeixo això a veure si funciona


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.da_item, myItem);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Current position", String.valueOf(position));


                if (position == 0){
                    //DoodleView2 doodle_view = (DoodleView2) findViewById(R.id.horari);
                    //doodle_view.setAssignatura(Assignatura.A7.getCodi(), Assignatura.A7.getNom(), Assignatura.A7.getCurs(), Assignatura.A7.getHoraris());
                    //doodle_view.setAssignatura(7, "Mates", 1, new int[]{3,3});

                    }
                
            }
        });



    }
}