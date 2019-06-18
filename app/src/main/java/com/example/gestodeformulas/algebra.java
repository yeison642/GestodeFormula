package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class algebra extends AppCompatActivity  {

        private TextView txAlgebra;
    ListView listView;
    String []temas = new String[] {"tema1","tema2","tema3","tema4","tema5","tema6"};



    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_algebra);

            listView =(ListView)findViewById(R.id.lvAlgebra);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
            listView.setAdapter(adapter);

            txAlgebra = (TextView) findViewById(R.id.txAlgebra);
            Bundle parametros = getIntent().getExtras();
            if(parametros != null){
                txAlgebra.setText(parametros.getString("PsAlgebra"));
            }
        }




}
