package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class quimica extends AppCompatActivity {

    private TextView txQuimica;
    ListView listView;
    String []temas = new String[] {"FORMULA 1","FORMULA 2","FORMULA 3","FORMULA 4","FORMULA 5","FORMULA 6"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quimica);

        listView =(ListView)findViewById(R.id.lvQuimica);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
        listView.setAdapter(adapter);

        txQuimica = (TextView) findViewById(R.id.txQuimica);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txQuimica.setText(parametros.getString("PsQuimica"));
        }
    }
}