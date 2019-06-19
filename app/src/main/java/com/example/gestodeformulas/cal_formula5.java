package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cal_formula5 extends AppCompatActivity {
    private TextView txCal_Formula5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_formula5);



        txCal_Formula5 = (TextView) findViewById(R.id.txCal_Formula5);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCal_Formula5.setText(parametros.getString("Pss5"));
        }
    }
}
