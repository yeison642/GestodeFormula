package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class quim_formula5  extends AppCompatActivity {

    private TextView txQuim_Formula5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quim_formula5);


        txQuim_Formula5 = (TextView) findViewById(R.id.txQuim_Formula5);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txQuim_Formula5.setText(parametros.getString("Pss5"));
        }
    }
}
