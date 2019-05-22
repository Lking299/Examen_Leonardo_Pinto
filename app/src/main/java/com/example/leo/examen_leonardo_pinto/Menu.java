package com.example.leo.examen_leonardo_pinto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    public String TipoConversion="",Conversion="";
    public Button CF,FC,CK,KC,MC,CM,CP,PC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.setTitle("Conversor de unidades");

    }
    public void caf(View v){
        CF=(Button)findViewById(R.id.btn_caf);
        TipoConversion=CF.getText().toString();
        Conversion="1";
        cambiar();
    }
    public void fac(View v){
        FC=(Button)findViewById(R.id.btn_fac);
        TipoConversion=FC.getText().toString();
        Conversion="2";
        cambiar();
    }
    public void cak(View v){
        CK=(Button)findViewById(R.id.btn_cak);
        TipoConversion=CK.getText().toString();
        Conversion="3";
        cambiar();
    }
    public void kac(View v){
        KC=(Button)findViewById(R.id.btn_kac);
        TipoConversion=KC.getText().toString();
        Conversion="4";
        cambiar();
    }
    public void mac(View v){
        MC=(Button)findViewById(R.id.btn_mac);
        TipoConversion=MC.getText().toString();
        Conversion="5";
        cambiar();
    }
    public void cam(View v){
        CM=(Button)findViewById(R.id.btn_cam);
        TipoConversion=CM.getText().toString();
        Conversion="6";
        cambiar();
    }
    public void cap(View v){
        CP=(Button)findViewById(R.id.btn_cai);
        TipoConversion=CP.getText().toString();
        Conversion="7";
        cambiar();
    }
    public void P_C(View v){
        PC=(Button)findViewById(R.id.btn_iac);
        TipoConversion=PC.getText().toString();
        Conversion="8";
        cambiar();
    }
    public void cambiar(){
        Intent window=new Intent(getApplicationContext(),Conver.class);
        window.putExtra("tipoConver",TipoConversion);
        window.putExtra("Conver",Conversion);
        startActivity(window);
    }
}


