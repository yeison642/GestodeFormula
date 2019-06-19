package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alg_formula2 extends AppCompatActivity {
    private TextView txAlg_Formula2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg_formula2);



        txAlg_Formula2 = (TextView) findViewById(R.id.txAlg_Formula2);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txAlg_Formula2.setText(parametros.getString("Pss2"));
        }
    }
}
