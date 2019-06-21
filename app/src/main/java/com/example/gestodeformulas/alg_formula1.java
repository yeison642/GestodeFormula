package com.example.gestodeformulas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class alg_formula1 extends AppCompatActivity {
    private TextView txAlg_Formula1;
    private Button añaFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_formula1);

        //mensaje boton favorito
        añaFavorito = (Button) findViewById(R.id.buttonFAlg1);
        añaFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Formula añadida a Favoritas",Toast.LENGTH_SHORT).show();

            }
        });

        txAlg_Formula1 = (TextView) findViewById(R.id.txAlg_Formula1);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txAlg_Formula1.setText(parametros.getString("Pss1"));
        }

    }

    //Metodo del boton favorito
    public void url(View view){
        Intent nexURL= new Intent(this, url.class);
        startActivity(nexURL);
    }
}
