package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fis_formula3 extends AppCompatActivity

    {

        private TextView txFis_Formula3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis_formula3);


        txFis_Formula3 = (TextView) findViewById(R.id.txFis_Formula3);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txFis_Formula3.setText(parametros.getString("Pss3"));
        }
    }
}
