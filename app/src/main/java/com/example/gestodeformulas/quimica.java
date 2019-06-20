package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class quimica extends AppCompatActivity implements ListView.OnItemClickListener{

    private TextView txQuimica;
    ListView listView;
    String []temas = new String[] {"BENCENO","GLUCOSA","PROPENO","ETENO","AGUA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quimica);

        listView =(ListView)findViewById(R.id.lvQuimica);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
        listView.setOnItemClickListener(this);
        listView.setAdapter(adapter);

        txQuimica = (TextView) findViewById(R.id.txQuimica);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txQuimica.setText(parametros.getString("PsQuimica"));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String form1 ="BENCENO";
            String form2 ="GLUCOSA";
            String form3 ="PROPENO";
            String form4 = "ETENO";
            String form5 = "AGUA";

            String valor = (String) adapterView.getItemAtPosition(i);

            if(valor ==  form1){
                Intent nuevoForm = new Intent(quimica.this,quim_formula1.class);
                nuevoForm.putExtra("Pss1",valor);
                startActivity(nuevoForm);
            }

            if(valor ==  form2){
                Intent nuevoForm = new Intent(quimica.this,quim_formula2.class);
                nuevoForm.putExtra("Pss2",valor);
                startActivity(nuevoForm);
            }


            if(valor ==  form3){
                Intent nuevoForm = new Intent(quimica.this,quim_formula3.class);
                nuevoForm.putExtra("Pss3",valor);
                startActivity(nuevoForm);
            }

            if(valor ==  form4){
                Intent nuevoForm = new Intent(quimica.this,quim_formula4.class);
                nuevoForm.putExtra("Pss4",valor);
                startActivity(nuevoForm);
            }

            if(valor ==  form5){
                Intent nuevoForm = new Intent(quimica.this,quim_formula5.class);
                nuevoForm.putExtra("Pss5",valor);
                startActivity(nuevoForm);
            }

        }
}