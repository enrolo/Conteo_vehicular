package com.example.rolo.conteo_vehicular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Resultado extends AppCompatActivity {

    int[] sumas;
    int prueba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //datos enviados desde activity Conteo
        //sumas = (int[][]) getIntent().getExtras().getSerializable("sumas");
        //sumas = getIntent().getIntArrayExtra("sumas");
        prueba = getIntent().getIntExtra("sumas",prueba);

    }
}
