package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class trigonometria extends AppCompatActivity {

    private TextView txTrigonometria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometria);

        txTrigonometria = (TextView) findViewById(R.id.txTrigonometria);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txTrigonometria.setText(parametros.getString("PsTrigonometria"));
        }
    }
}


