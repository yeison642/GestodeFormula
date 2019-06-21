package com.example.gestodeformulas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class quim_formula1 extends AppCompatActivity {

    private TextView txQuim_Formula1;
    private Button añaFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quim_formula1);


        //mensaje boton favorito
        añaFavorito = (Button) findViewById(R.id.buttonFQuim1);
        añaFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Formula añadida a Favoritas",Toast.LENGTH_SHORT).show();

            }
        });

        txQuim_Formula1 = (TextView) findViewById(R.id.txQuim_Formula1);
        Bundle parametros = getIntent().getExtras();

    }
    //Metodo del boton favorito
    public void url(View view){
        Intent nexURL= new Intent(this, url.class);
        startActivity(nexURL);
    }
}
