package com.example.rolo.conteo_vehicular;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Conteo extends AppCompatActivity {
    ImageButton bbici,bmoto,bcolectivo,btaxi,bauto,bcamion,bmicro,bbus,bcamiongrande,barriba,bizquierda,bderecha;
    TextView tvbici,tvmoto,tvcolectivo,tvtaxi,tvauto,tvcamion,tvmicro,tvbus,tvcamiongrande;
    boolean[] movs;
    boolean[] vehiculos;
    int vehiculo=0;
    int mov=0;
    //matriz para guardar todas las adiciones (la fila es vacía y no se ocupa)
    int[][] sumas = new int[10][4];

    int seg=0;

    TextView tvintervalo;

    @Override
    public void onBackPressed() {
        //Toast.makeText(this,"No se puede volver",Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }

    //@Override
    //public void onAttachedToWindow(){
        //Toast.makeText(this,"No se puede salir",Toast.LENGTH_SHORT).show();

    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo);

        //llenando la matriz sumas con puros ceros;
        for (int i=1;i<=9;i++){
            for (int j=0;i<=4;i++){
                sumas[i][j]=0;
            }
        }

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

        tvintervalo = (TextView) findViewById(R.id.tvintervalo);

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

        thread.start();
        threadcambio.start();

        /*for (int i=1;i<=10;i++) {
            try {
                Thread.sleep(1000, 0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tvintervalo.setText(String.valueOf(i));
        }*/
    }

    //thread para mostrar intervalos
    Thread thread = new Thread() {

        @Override
        public void run() {
            try {
                tvintervalo.setText("Intervalo: 1");
                while (!thread.isInterrupted()) {
                    Thread.sleep(500);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            //Calendar calendario = new java.util.GregorianCalendar();
                            //int seg = calendario.get(Calendar.SECOND);
                            tvintervalo.setText(" intervalo: "+String.valueOf(seg+1));
                            seg++;
                            if(seg==8){
                                tvintervalo.setText("Jornada finalizada");
                                seg++;
                                thread.interrupt();
                            }
                        }
                    });
                }
            } catch (InterruptedException e) {
            }
        }
    };

    Thread threadcambio = new Thread() {

        @Override
        public void run() {
            try {
                while (!thread.isInterrupted()) {
                    /*if (seg > 8) {
                        Intent abrirresultado = new Intent(Conteo.this, Resultado.class);
                        startActivity(abrirresultado);
                        threadcambio.interrupt();
                    }
                }*/}
                Thread.sleep(1000);
                Intent abrirresultado = new Intent(Conteo.this, Resultado.class);
                //abrirresultado.putExtra("sumas", sumas[1]);
                abrirresultado.putExtra("sumas", 3);
                //Bundle mBundle = new Bundle();
                //mBundle.putSerializable("sumas",sumas);
                //abrirresultado.putExtras(mBundle);

                startActivity(abrirresultado);
                threadcambio.interrupt();

            } catch(Exception e){}
        }
    };

    public void bici(View view){
        vehiculo = 1;
    }public void moto(View view){
        vehiculo = 2;
    }public void colectivo(View view){
        vehiculo = 3;
    }public void taxi(View view){
        vehiculo = 4;
    }public void auto(View view){
        vehiculo = 5;
    }public void camion(View view){
        vehiculo = 6;
    }public void micro(View view){
        vehiculo = 7;
    }public void bus(View view){
        vehiculo = 8;
    }public void camiongrande(View view){
        vehiculo = 9;
    }
    public void arriba(View view){
        if(vehiculo!=0) {
            mov = 1;
        }else{
            Toast.makeText(this,"Seleccione previamente un vehículo",Toast.LENGTH_SHORT).show();
        }
        adicion(vehiculo,mov);
        vehiculo = 0;
    }
    public void izquierda(View view){
        if(vehiculo!=0) {
            mov = 2;
        }else{
            Toast.makeText(this,"Seleccione previamente un vehículo",Toast.LENGTH_SHORT).show();
        }
        adicion(vehiculo,mov);
        vehiculo = 0;
    }
    public void derecha(View view){
        if(vehiculo!=0) {
            mov = 3;
        }else{
            Toast.makeText(this,"Seleccione previamente un vehículo",Toast.LENGTH_SHORT).show();
        }
        adicion(vehiculo,mov);
        vehiculo = 0;
    }

    //metodo para sumar los vehiculos según tipo y movimiento
    public void adicion(int i,int j){
        sumas[i][j]++;
        sumas[i][0]++;
        switch (i){
            case 1: tvbici.setText(String.valueOf(sumas[i][0]));
            break;
            case 2: tvmoto.setText(String.valueOf(sumas[i][0]));
            break;
            case 3: tvcolectivo.setText(String.valueOf(sumas[i][0]));
                break;
            case 4: tvtaxi.setText(String.valueOf(sumas[i][0]));
                break;
            case 5: tvauto.setText(String.valueOf(sumas[i][0]));
                break;
            case 6: tvcamion.setText(String.valueOf(sumas[i][0]));
                break;
            case 7: tvmicro.setText(String.valueOf(sumas[i][0]));
                break;
            case 8: tvbus.setText(String.valueOf(sumas[i][0]));
                break;
            case 9: tvcamiongrande.setText(String.valueOf(sumas[i][0]));
                break;
        }
    }
}
