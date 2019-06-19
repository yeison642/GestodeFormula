package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cal_formula2 extends AppCompatActivity {
    private TextView txCal_Formula2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_formula2);



        txCal_Formula2 = (TextView) findViewById(R.id.txCal_Formula2);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCal_Formula2.setText(parametros.getString("Pss2"));
        }
    }
}
