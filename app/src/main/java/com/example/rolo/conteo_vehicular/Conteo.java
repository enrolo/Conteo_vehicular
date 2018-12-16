package com.example.rolo.conteo_vehicular;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Conteo extends AppCompatActivity {
    ImageButton bbici,bmoto,bcolectivo,btaxi,bauto,bcamion,bmicro,bbus,bcamiongrande,barriba,bizquierda,bderecha;
    TextView tvbici,tvmoto,tvcolectivo,tvtaxi,tvauto,tvcamion,tvmicro,tvbus,tvcamiongrande;
    boolean[] movs;
    boolean[] vehiculos;
    int vehiculo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo);

        //datos enviados desde activity vehiculos
        movs = getIntent().getBooleanArrayExtra("movs");
        vehiculos = getIntent().getBooleanArrayExtra("vehiculos");


        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        //getSupportActionBar().hide();

        bbici = (ImageButton) findViewById(R.id.bbici);
        bmoto = (ImageButton) findViewById(R.id.bmoto);
        bcolectivo = (ImageButton) findViewById(R.id.bcolectivo);
        btaxi = (ImageButton) findViewById(R.id.btaxi);
        bauto = (ImageButton) findViewById(R.id.bauto);
        bcamion = (ImageButton) findViewById(R.id.bcamion);
        bmicro = (ImageButton) findViewById(R.id.bmicro);
        bbus = (ImageButton) findViewById(R.id.bbus);
        bcamiongrande = (ImageButton) findViewById(R.id.bcamiongrande);
        barriba = (ImageButton) findViewById(R.id.barriba);
        bizquierda= (ImageButton) findViewById(R.id.bizquierda);
        bderecha= (ImageButton) findViewById(R.id.bderecha);

        tvbici = (TextView) findViewById(R.id.tvbici);
        tvmoto = (TextView) findViewById(R.id.tvmoto);
        tvcolectivo = (TextView) findViewById(R.id.tvcolectivo);
        tvtaxi = (TextView) findViewById(R.id.tvtaxi);
        tvauto = (TextView) findViewById(R.id.tvauto);
        tvcamion = (TextView) findViewById(R.id.tvcamion);
        tvmicro = (TextView) findViewById(R.id.tvmicro);
        tvbus = (TextView) findViewById(R.id.tvbus);
        tvcamiongrande = (TextView) findViewById(R.id.tvcamiongrande);

        //ocultando los botones no seleccionados
        if(vehiculos[0]==false) {
            bbici.setVisibility(View.INVISIBLE);
            tvbici.setVisibility(View.INVISIBLE);
        }if(vehiculos[1]==false) {
            bmoto.setVisibility(View.INVISIBLE);
            tvmoto.setVisibility(View.INVISIBLE);
        }if(vehiculos[2]==false) {
            bcolectivo.setVisibility(View.INVISIBLE);
            tvcolectivo.setVisibility(View.INVISIBLE);
        }if(vehiculos[3]==false) {
            btaxi.setVisibility(View.INVISIBLE);
            tvtaxi.setVisibility(View.INVISIBLE);
        }if(vehiculos[4]==false) {
            bauto.setVisibility(View.INVISIBLE);
            tvauto.setVisibility(View.INVISIBLE);
        }if(vehiculos[5]==false) {
            bcamion.setVisibility(View.INVISIBLE);
            tvcamion.setVisibility(View.INVISIBLE);
        }if(vehiculos[6]==false) {
            bmicro.setVisibility(View.INVISIBLE);
            tvmicro.setVisibility(View.INVISIBLE);
        }if(vehiculos[7]==false) {
            bbus.setVisibility(View.INVISIBLE);
            tvbus.setVisibility(View.INVISIBLE);
        }if(vehiculos[8]==false) {
            bcamiongrande.setVisibility(View.INVISIBLE);
            tvcamiongrande.setVisibility(View.INVISIBLE);
        }
        //ocultando botones de movimiento no seleccionados
        if(movs[0]==false){
            barriba.setVisibility(View.INVISIBLE);
        }
        if(movs[1]==false){
            bizquierda.setVisibility(View.INVISIBLE);
        }
        if(movs[2]==false){
            bderecha.setVisibility(View.INVISIBLE);
        }


    }
    public void bici(View view){
        vehiculo = 1;
    }
}
