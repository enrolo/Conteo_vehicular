package com.example.rolo.conteo_vehicular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Vehiculo extends AppCompatActivity {
    CheckBox chkbici,chkmoto,chkcolectivo,chktaxi,chkauto,chkcamion,chkmicro,chkbus,chkcamiongrande;
    Button bsiguiente;
    boolean[] movs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculo);

        //datos enviados desde activity movimiento
        movs = getIntent().getBooleanArrayExtra("movs");

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
        //guardando la elección de vehiculos como valores booleanos en un arreglo
        boolean[] vehiculos ={chkbici.isChecked(),chkmoto.isChecked(),chkcolectivo.isChecked(),chktaxi.isChecked(),chkauto.isChecked(),chkcamion.isChecked(),chkmicro.isChecked(),chkbus.isChecked(),chkcamiongrande.isChecked()};
        boolean v=false;
        //evaluando existencia de al menos una elección de vehículo
        for (int i=0;i<=8;i++){
            if(vehiculos[i]){
                v=true;
                break;
            }
            String b = String.valueOf(vehiculos[i]);
            Log.i("Vehiculo",b);
        }

        if(v==false){
            Toast.makeText(this,"Debe seleccionar al menos un vehículo",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent abrirconteo = new Intent(Vehiculo.this, Conteo.class);
            abrirconteo.putExtra("movs",movs);
            abrirconteo.putExtra("vehiculos", vehiculos);
            startActivity(abrirconteo);
        }
    }
}
