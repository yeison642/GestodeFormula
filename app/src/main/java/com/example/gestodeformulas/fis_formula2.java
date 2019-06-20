package com.example.gestodeformulas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class fis_formula2 extends AppCompatActivity {

    private TextView txFis_Formula2;
    private Button añaFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis_formula2);

        //mensaje boton favorito
        añaFavorito = (Button) findViewById(R.id.buttonFFis2);
        añaFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Formula añadida a Favoritas",Toast.LENGTH_SHORT).show();

            }
        });

        txFis_Formula2 = (TextView) findViewById(R.id.txFis_Formula2);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txFis_Formula2.setText(parametros.getString("Pss2"));
        }
    }
}
