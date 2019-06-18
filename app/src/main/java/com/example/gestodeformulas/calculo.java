package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class calculo extends AppCompatActivity {

    private TextView txCalculo;
    ListView listView;
    String []temas = new String[] {"ALGEBRA","CALCULO","ESTADISTICA","FISICA","QUIMICA","TRIGONOMETRIA"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        listView =(ListView)findViewById(R.id.lvCalculo);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,temas);
        listView.setAdapter(adapter);


        txCalculo = (TextView) findViewById(R.id.txCalculo);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCalculo.setText(parametros.getString("PsCalculo"));
        }
    }
}
