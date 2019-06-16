package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView listView;
    String []valores = new String[] {"ALGEBRA","CALCULO","ESTADISTICA","FISICA","QUIMICA","TRIGONOMETRIA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.lvLista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valores);
        listView.setOnItemClickListener(this);
        listView.setAdapter(adapter);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String algebraV ="ALGEBRA";
        String calculoV ="CALCULO";
        String estadisticaV ="ESTADISTICA";
        String fisicaV = "FISICA";
        String quimicaV = "QUIMICA";
        String trigonometriaV = "TRIGONOMETRIA";

        String valor = (String) adapterView.getItemAtPosition(i);

        if(valor ==  algebraV){
            Intent nuevoForm = new Intent(MainActivity.this,algebra.class);
            nuevoForm.putExtra("PsAlgebra",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  calculoV){
            Intent nuevoForm = new Intent(MainActivity.this,calculo.class);

            nuevoForm.putExtra("PsCalculo",valor);
            startActivity(nuevoForm);
        }


        if(valor ==  estadisticaV){
            Intent nuevoForm = new Intent(MainActivity.this,estadistica.class);
            nuevoForm.putExtra("PsEstadistica",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  fisicaV){
            Intent nuevoForm = new Intent(MainActivity.this,fisica.class);
            nuevoForm.putExtra("PsFisica",valor);
            startActivity(nuevoForm);
        }
        if(valor ==  quimicaV){
            Intent nuevoForm = new Intent(MainActivity.this,quimica.class);
            nuevoForm.putExtra("PsQuimica",valor);
            startActivity(nuevoForm);
        }
        if(valor ==  trigonometriaV){
            Intent nuevoForm = new Intent(MainActivity.this,trigonometria.class);
            nuevoForm.putExtra("PsTrigonometria",valor);
            startActivity(nuevoForm);
        }




    }
}
