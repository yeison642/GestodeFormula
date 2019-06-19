package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alg_formula1 extends AppCompatActivity {
    private TextView txAlg_Formula1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_formula1);



        txAlg_Formula1 = (TextView) findViewById(R.id.txAlg_Formula1);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txAlg_Formula1.setText(parametros.getString("Pss1"));
        }
    }
}
