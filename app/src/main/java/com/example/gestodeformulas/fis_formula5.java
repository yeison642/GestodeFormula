package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fis_formula5 extends AppCompatActivity {

    private TextView txFis_Formula5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis_formula5);


        txFis_Formula5 = (TextView) findViewById(R.id.txFis_Formula5);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txFis_Formula5.setText(parametros.getString("Pss5"));
        }
    }
}
