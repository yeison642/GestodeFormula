package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class quim_formula3  extends AppCompatActivity {

    private TextView txQuim_Formula3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quim_formula3);


        txQuim_Formula3 = (TextView) findViewById(R.id.txQuim_Formula3);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txQuim_Formula3.setText(parametros.getString("Pss3"));
        }
    }
}
