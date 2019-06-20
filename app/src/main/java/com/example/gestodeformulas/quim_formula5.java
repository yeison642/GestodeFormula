package com.example.gestodeformulas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class quim_formula5  extends AppCompatActivity {

    private TextView txQuim_Formula5;
    private Button añaFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quim_formula5);

        //mensaje boton favorito
        añaFavorito = (Button) findViewById(R.id.buttonFQuim5);
        añaFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Formula añadida a Favoritas",Toast.LENGTH_SHORT).show();

            }
        });


        txQuim_Formula5 = (TextView) findViewById(R.id.txQuim_Formula5);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txQuim_Formula5.setText(parametros.getString("Pss5"));
        }
    }
}
