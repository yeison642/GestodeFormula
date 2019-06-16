package com.example.gestodeformulas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class algebra extends AppCompatActivity {

        private TextView txAlgebra;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_algebra);

            txAlgebra = (TextView) findViewById(R.id.txAlgebra);
            Bundle parametros = getIntent().getExtras();
            if(parametros != null){
                txAlgebra.setText(parametros.getString("PsAlgebra"));
            }
        }
}
