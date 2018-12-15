package com.example.rolo.conteo_vehicular;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Conteo extends AppCompatActivity {
    ImageButton bbici,bmoto,bcolectivo,btaxi,bauto,bcamion,bmicro,bbus,bcamiongrande;
    TextView tvbici,tvmoto,tvcolectivo,tvtaxi,tvauto,tvcamion,tvmicro,tvbus,tvcamiongrande;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo);

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

        tvbici = (TextView) findViewById(R.id.tvbici);
        tvmoto = (TextView) findViewById(R.id.tvmoto);
        tvcolectivo = (TextView) findViewById(R.id.tvcolectivo);
        tvtaxi = (TextView) findViewById(R.id.tvtaxi);
        tvauto = (TextView) findViewById(R.id.tvauto);
        tvcamion = (TextView) findViewById(R.id.tvcamion);
        tvmicro = (TextView) findViewById(R.id.tvmicro);
        tvbus = (TextView) findViewById(R.id.tvbus);
        tvcamiongrande = (TextView) findViewById(R.id.tvcamiongrande);
    }
}
