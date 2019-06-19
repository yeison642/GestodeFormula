package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fis_formula1 extends AppCompatActivity {

    private TextView txFis_Formula1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis_formula1);


        txFis_Formula1 = (TextView) findViewById(R.id.txFis_Formula1);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txFis_Formula1.setText(parametros.getString("Pss1"));
        }
    }
}