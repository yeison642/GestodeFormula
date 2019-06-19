package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class quim_formula2  extends AppCompatActivity {

    private TextView txQuim_Formula2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quim_formula2);


        txQuim_Formula2 = (TextView) findViewById(R.id.txQuim_Formula2);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txQuim_Formula2.setText(parametros.getString("Pss2"));
        }
    }
}
