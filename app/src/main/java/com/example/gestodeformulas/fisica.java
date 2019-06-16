package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fisica extends AppCompatActivity {
    private TextView txFisica;

    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);

        txFisica = (TextView) findViewById(R.id.txAlgebra);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txFisica.setText(parametros.getString("PsFisica"));
        }
    }
}
