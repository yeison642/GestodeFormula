package com.example.gestodeformulas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class cal_formula3 extends AppCompatActivity {

    private TextView txCal_Formula3;
    private Button añaFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_formula3);

//mensaje boton favorito
        añaFavorito = (Button) findViewById(R.id.buttonFCal3);
        añaFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Formula añadida a Favoritas",Toast.LENGTH_SHORT).show();

            }
        });

        txCal_Formula3 = (TextView) findViewById(R.id.txCal_Formula3);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCal_Formula3.setText(parametros.getString("Pss3"));
        }
    }
    //Metodo del boton favorito
    public void url(View view){
        Intent nexURL= new Intent(this, url.class);
        startActivity(nexURL);
    }
}
