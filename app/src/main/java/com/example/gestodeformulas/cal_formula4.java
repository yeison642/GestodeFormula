package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cal_formula4 extends AppCompatActivity {
    private TextView txCal_Formula4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_formula4);



        txCal_Formula4 = (TextView) findViewById(R.id.txCal_Formula4);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCal_Formula4.setText(parametros.getString("Pss4"));
        }
    }
}
