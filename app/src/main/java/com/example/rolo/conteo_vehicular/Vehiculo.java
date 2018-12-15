package com.example.rolo.conteo_vehicular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Vehiculo extends AppCompatActivity {
    CheckBox chkbici,chkmoto,chkcolectivo,chktaxi,chkauto,chkcamion,chkmicro,chkbus,chkcamiongrande;
    Button bsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculo);
        chkbici= (CheckBox) findViewById(R.id.chkbici);
        chkmoto= (CheckBox) findViewById(R.id.chkmoto);
        chkcolectivo= (CheckBox) findViewById(R.id.chkcolectivo);
        chktaxi= (CheckBox) findViewById(R.id.chktaxi);
        chkauto= (CheckBox) findViewById(R.id.chkauto);
        chkcamion= (CheckBox) findViewById(R.id.chkcamion);
        chkmicro= (CheckBox) findViewById(R.id.chkmicro);
        chkbus= (CheckBox) findViewById(R.id.chkbus);
        chkcamiongrande= (CheckBox) findViewById(R.id.chkcamiongrande);
        bsiguiente = (Button) findViewById(R.id.bsiguiente);
    }
    public void aconteo(View view){
        Intent abrirconteo= new Intent(Vehiculo.this, Conteo.class);
        startActivity(abrirconteo);
    }
}
