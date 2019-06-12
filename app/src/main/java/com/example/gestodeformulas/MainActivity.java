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
    String []valores = new String[] {"ALGEBRA","CALCULO","FISICA","QUIMICA","TRIGONOMETRIA","ESTADISTICA"};


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
        String valor = (String) adapterView.getItemAtPosition(i);
        Intent nuevoForm = new Intent(MainActivity.this,calculo.class);
        nuevoForm.putExtra("Categorias",valor);
        startActivity(nuevoForm);

    }
}
