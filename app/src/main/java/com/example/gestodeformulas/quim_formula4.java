package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class quim_formula4  extends AppCompatActivity {

    private TextView txQuim_Formula4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quim_formula4);


        txQuim_Formula4 = (TextView) findViewById(R.id.txQuim_Formula4);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txQuim_Formula4.setText(parametros.getString("Pss4"));
        }
    }
}
