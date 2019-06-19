package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cal_formula3 extends AppCompatActivity {

    private TextView txCal_Formula3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_formula3);



        txCal_Formula3 = (TextView) findViewById(R.id.txCal_Formula3);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txCal_Formula3.setText(parametros.getString("Pss3"));
        }
    }
}
