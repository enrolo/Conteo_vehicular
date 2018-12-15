package com.example.rolo.conteo_vehicular;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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
    int valor = 0;
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
        //if(){}
        valor = 1;
        String[] op = {"Seleccione esquina","A","B","C","D"};
        ArrayAdapter <String> array = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,op);
        spubicacion.setAdapter(array);
        Toast.makeText(this,"ha seleccionado intersección cruz",Toast.LENGTH_SHORT).show();
    }
    public void alclick2(View view){
        valor = 2;
        String[] op = {"Seleccione esquina","A","B","C"};
        ArrayAdapter <String> array = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,op);
        spubicacion.setAdapter(array);
        Toast.makeText(this,"ha seleccionado intersección t",Toast.LENGTH_SHORT).show();
    }

    public void amovimiento(View view){
        boolean v=true;
        String callev = etcallev.getText().toString().trim();
        String calleh = etcalleh.getText().toString().trim();
        String seleccion = spubicacion.getSelectedItem().toString();
        //Toast.makeText(this,seleccion,Toast.LENGTH_SHORT).show();
        if(valor==0){
            Toast.makeText(this,"Seleccione intersección",Toast.LENGTH_SHORT).show();
            v=false;
        }if (callev.isEmpty() || calleh.isEmpty()) {
            Toast.makeText(this,"No deje campos en blanco",Toast.LENGTH_SHORT).show();
            v=false;
        }if(seleccion=="Seleccione esquina"){
            Toast.makeText(this,"Seleccione esquina",Toast.LENGTH_SHORT).show();
            v=false;
        }if(v){
            Intent abrirmovimiento = new Intent(Interseccion.this, Movimiento.class);
            startActivity(abrirmovimiento);
        }
    }
}
