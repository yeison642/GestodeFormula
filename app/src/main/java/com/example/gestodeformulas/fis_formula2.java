package com.example.gestodeformulas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fis_formula2 extends AppCompatActivity {

    private TextView txFis_Formula2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis_formula2);


        txFis_Formula2 = (TextView) findViewById(R.id.txFis_Formula2);
        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            txFis_Formula2.setText(parametros.getString("Pss2"));
        }
    }
}
