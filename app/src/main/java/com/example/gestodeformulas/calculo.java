package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calculo extends AppCompatActivity {

    private TextView txCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        txCalculo = (TextView) findViewById(R.id.txCalculo);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCalculo.setText(parametros.getString("PsCalculo"));
        }
    }
}
