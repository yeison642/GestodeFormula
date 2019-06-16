package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class quimica extends AppCompatActivity {

    private TextView txQuimica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quimica);

        txQuimica = (TextView) findViewById(R.id.txQuimica);
        Bundle parametros = getIntent().getExtras();
        if(parametros != null){
            txQuimica.setText(parametros.getString("PsQuimica"));
        }
    }
}