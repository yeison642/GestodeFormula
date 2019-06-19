package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alg_formula5 extends AppCompatActivity {
    private TextView txAlg_Formula5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_formula5);



        txAlg_Formula5 = (TextView) findViewById(R.id.txAlg_Formula5);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txAlg_Formula5.setText(parametros.getString("Pss5"));
        }
    }
}
