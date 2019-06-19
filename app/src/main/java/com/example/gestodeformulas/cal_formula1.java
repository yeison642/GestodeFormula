package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cal_formula1 extends AppCompatActivity {

    private TextView txCal_Formula1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_formula1);



        txCal_Formula1 = (TextView) findViewById(R.id.txCal_Formula1);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCal_Formula1.setText(parametros.getString("Pss1"));
        }
    }


}
