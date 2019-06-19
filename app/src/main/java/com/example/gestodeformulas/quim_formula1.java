package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class quim_formula1 extends AppCompatActivity {

    private TextView txQuim_Formula1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quim_formula1);


        txQuim_Formula1 = (TextView) findViewById(R.id.txQuim_Formula1);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txQuim_Formula1.setText(parametros.getString("Pss1"));
        }
    }
}
