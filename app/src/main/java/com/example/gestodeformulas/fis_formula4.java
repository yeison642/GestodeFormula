package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fis_formula4 extends AppCompatActivity {

    private TextView txFis_Formula4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis_formula4);


        txFis_Formula4 = (TextView) findViewById(R.id.txFis_Formula4);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txFis_Formula4.setText(parametros.getString("Pss4"));
        }
    }
}
