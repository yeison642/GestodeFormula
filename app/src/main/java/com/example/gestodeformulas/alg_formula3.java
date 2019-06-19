package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alg_formula3 extends AppCompatActivity {
    private TextView txAlg_Formula3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_formula3);



        txAlg_Formula3 = (TextView) findViewById(R.id.txAlg_Formula3);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txAlg_Formula3.setText(parametros.getString("Pss3"));
        }
    }
}
