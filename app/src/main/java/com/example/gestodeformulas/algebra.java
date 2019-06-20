package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class algebra extends AppCompatActivity implements ListView.OnItemClickListener  {

    private TextView txAlgebra;
    ListView listView;
    String []temas = new String[] {"MATRICES","VECTORES","POLINOMIOS","FACTORIZACION","VALOR ABSOLUTO"};



    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_algebra);

            listView =(ListView)findViewById(R.id.lvAlgebra);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
            listView.setOnItemClickListener(this);
            listView.setAdapter(adapter);

            txAlgebra = (TextView) findViewById(R.id.txAlgebra);
            Bundle parametros = getIntent().getExtras();
            if(parametros != null){
                txAlgebra.setText(parametros.getString("PsAlgebra"));
            }
        }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String form1 ="MATRICES";
        String form2 ="VECTORES";
        String form3 ="POLINOMIOS";
        String form4 = "FACTORIZACION";
        String form5 = "VALOR ABSOLUTO";

        String valor = (String) adapterView.getItemAtPosition(i);

        if(valor ==  form1){
            Intent nuevoForm = new Intent(algebra.this,alg_formula1.class);
            nuevoForm.putExtra("Pss1",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  form2){
            Intent nuevoForm = new Intent(algebra.this,alg_formula2.class);
            nuevoForm.putExtra("Pss2",valor);
            startActivity(nuevoForm);
        }


        if(valor ==  form3){
            Intent nuevoForm = new Intent(algebra.this,alg_formula3.class);
            nuevoForm.putExtra("Pss3",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  form4){
            Intent nuevoForm = new Intent(algebra.this,alg_formula4.class);
            nuevoForm.putExtra("Pss4",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  form5){
            Intent nuevoForm = new Intent(algebra.this,alg_formula5.class);
            nuevoForm.putExtra("Pss5",valor);
            startActivity(nuevoForm);
        }
    }
}
