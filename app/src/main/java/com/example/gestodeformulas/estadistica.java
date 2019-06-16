package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class estadistica extends AppCompatActivity {

    private TextView txEstadistica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica);

        txEstadistica = (TextView) findViewById(R.id.txEstadistica);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txEstadistica.setText(parametros.getString("PsEstadistica"));
        }
    }
}

