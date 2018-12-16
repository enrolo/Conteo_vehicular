package com.example.rolo.conteo_vehicular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Movimiento extends AppCompatActivity {
    CheckBox chkarriba,chkizquierda,chkderecha;
    Button bsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimiento);
        chkarriba = (CheckBox) findViewById(R.id.chkarriba);
        chkizquierda = (CheckBox) findViewById(R.id.chkizquierda);
        chkderecha= (CheckBox) findViewById(R.id.chkderecha);
        bsiguiente = (Button) findViewById(R.id.bsiguiente);
    }
    public void avehiculo(View view) {
        boolean[] movs = {chkarriba.isChecked(),chkizquierda.isChecked(),chkderecha.isChecked()};
        if(chkarriba.isChecked()||chkizquierda.isChecked()||chkderecha.isChecked()){
            Intent abrirvehiculo = new Intent(Movimiento.this, Vehiculo.class);
            //enviando datos de movimientos escogidos para dejar activados solo los botones respectivos en la activity subsiguiente (conteo)
            abrirvehiculo.putExtra("movs",movs);
            startActivity(abrirvehiculo);
        }
        else{
            Toast.makeText(this,"Debe seleccionar al menos un movimiento",Toast.LENGTH_SHORT).show();
        }
    }
}
