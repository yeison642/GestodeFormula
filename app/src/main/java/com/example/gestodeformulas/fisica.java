package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fisica extends AppCompatActivity {
    private TextView txFisica;
    ListView listView;
    String []temas = new String[] {"FORMULA 1","FORMULA 2","FORMULA 3","FORMULA 4","FORMULA 5","FORMULA 6"};


    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);

        listView =(ListView)findViewById(R.id.lvFisica);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
        listView.setAdapter(adapter);

        txFisica = (TextView) findViewById(R.id.txFisica);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txFisica.setText(parametros.getString("PsFisica"));
        }
    }
}
