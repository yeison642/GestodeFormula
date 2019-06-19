package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alg_formula4 extends AppCompatActivity {
    private TextView txAlg_Formula4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_formula4);



        txAlg_Formula4 = (TextView) findViewById(R.id.txAlg_Formula4);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txAlg_Formula4.setText(parametros.getString("Pss4"));
        }
    }
}
