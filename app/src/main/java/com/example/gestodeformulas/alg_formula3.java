package com.example.gestodeformulas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class alg_formula3 extends AppCompatActivity {
    private TextView txAlg_Formula3;
    private Button añaFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_formula3);


//mensaje boton favorito
        añaFavorito = (Button) findViewById(R.id.buttonFAlg3);
        añaFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Formula añadida a Favoritas",Toast.LENGTH_SHORT).show();

            }
        });

        txAlg_Formula3 = (TextView) findViewById(R.id.txAlg_Formula3);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txAlg_Formula3.setText(parametros.getString("Pss3"));
        }
    }

    //Metodo del boton favorito
    public void url(View view){
        Intent nexURL= new Intent(this, url.class);
        startActivity(nexURL);
    }
}
