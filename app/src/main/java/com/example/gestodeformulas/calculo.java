package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class calculo extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        tv2 = (TextView) findViewById(R.id.tv2);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            tv2.setText(parametros.getString("Categorias"));

        }
    }
}
