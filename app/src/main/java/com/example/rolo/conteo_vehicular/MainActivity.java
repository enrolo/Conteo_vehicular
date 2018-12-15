package com.example.rolo.conteo_vehicular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etnombre,etapellido,etrut,etcorreo;
    Button bingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnombre = (EditText) findViewById(R.id.etnombre);
        etapellido = (EditText) findViewById(R.id.etapellido);
        etrut = (EditText) findViewById(R.id.etrut);
        etcorreo= (EditText) findViewById(R.id.etcorreo);

    }
    public void ainterseccion(View view) {
        String nombre = etnombre.getText().toString().trim();
        String apellido = etapellido.getText().toString().trim();
        String rut = etrut.getText().toString().trim();
        String correo = etcorreo.getText().toString().trim();
        //if (nombre.isEmpty() || apellido.isEmpty() || rut.isEmpty() || correo.isEmpty()) {
        //    Toast.makeText(this,"No deje campos en blanco",Toast.LENGTH_SHORT).show();
        //}else{
            Intent abririnterseccion = new Intent(MainActivity.this, Interseccion.class);
            startActivity(abririnterseccion);
        //}
    }
}
