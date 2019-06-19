package com.example.gestodeformulas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fisica extends AppCompatActivity  implements ListView.OnItemClickListener{
    private TextView txFisica;
    ListView listView;
    String []temas = new String[] {"FORMULA1","FORMULA2","FORMULA3","FORMULA4","FORMULA5"};


    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);

        listView =(ListView)findViewById(R.id.lvFisica);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
        listView.setOnItemClickListener(this);
        listView.setAdapter(adapter);

        txFisica = (TextView) findViewById(R.id.txFisica);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txFisica.setText(parametros.getString("PsFisica"));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String form1 ="FORMULA1";
        String form2 ="FORMULA2";
        String form3 ="FORMULA3";
        String form4 = "FORMULA4";
        String form5 = "FORMULA5";

        String valor = (String) adapterView.getItemAtPosition(i);

        if(valor ==  form1){
            Intent nuevoForm = new Intent(fisica.this,fis_formula1.class);
            nuevoForm.putExtra("Pss1",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  form2){
            Intent nuevoForm = new Intent(fisica.this,fis_formula2.class);
            nuevoForm.putExtra("Pss2",valor);
            startActivity(nuevoForm);
        }


        if(valor ==  form3){
            Intent nuevoForm = new Intent(fisica.this,fis_formula3.class);
            nuevoForm.putExtra("Pss3",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  form4){
            Intent nuevoForm = new Intent(fisica.this,fis_formula4.class);
            nuevoForm.putExtra("Pss4",valor);
            startActivity(nuevoForm);
        }

        if(valor ==  form5){
            Intent nuevoForm = new Intent(fisica.this,fis_formula5.class);
            nuevoForm.putExtra("Pss5",valor);
            startActivity(nuevoForm);
        }

    }
}
