package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class estadistica extends AppCompatActivity {

    private TextView txEstadistica;
    ListView listView;
    String []temas = new String[] {"FORMULA 1","FORMULA 2","FORMULA 3","FORMULA 4","FORMULA 5","FORMULA 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica);

        listView =(ListView)findViewById(R.id.lvEstadistica);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
        listView.setAdapter(adapter);

        txEstadistica = (TextView) findViewById(R.id.txEstadistica);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txEstadistica.setText(parametros.getString("PsEstadistica"));
        }
    }
}

