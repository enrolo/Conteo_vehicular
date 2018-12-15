package com.example.rolo.conteo_vehicular;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Interseccion extends AppCompatActivity {
    ImageButton bintcruz,bintt;
    TextView etcallev,etcalleh;
    Button bsiguiente;
    Spinner spubicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interseccion);
        bintcruz = (ImageButton) findViewById(R.id.bintcruz);
        bintt = (ImageButton) findViewById(R.id.bintt);
        etcallev = (TextView) findViewById(R.id.etcallev);
        etcalleh = (TextView) findViewById(R.id.etcalleh);
        bsiguiente = (Button) findViewById(R.id.bsiguiente);
        spubicacion = (Spinner) findViewById(R.id.spubicacion);
    }

    //para probar los botones
    public void alclick1(View view){
        Toast.makeText(this,"ha seleccionado intersección cruz",Toast.LENGTH_SHORT).show();
    }
    public void alclick2(View view){
        Toast.makeText(this,"ha seleccionado intersección t",Toast.LENGTH_SHORT).show();
    }

    public void amovimiento(View view){
        Intent abrirmovimiento= new Intent(Interseccion.this, Movimiento.class);
        startActivity(abrirmovimiento);
    }
}
