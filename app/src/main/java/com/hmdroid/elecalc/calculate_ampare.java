package com.hmdroid.elecalc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;

public class calculate_ampare extends AppCompatActivity {

   EditText voltage;
   EditText resistance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_ampare);
    }
    public void ampare(View view) {
        voltage = (EditText) findViewById(R.id.voltage);
        resistance = (EditText) findViewById(R.id.resistance);

        BigDecimal v =new
                BigDecimal(voltage.getText().toString());
        BigDecimal r = new
                BigDecimal(resistance.getText().toString());
        double i = v.divide(r, 3, BigDecimal.ROUND_HALF_UP).doubleValue();


        AlertDialog.Builder alert01 = new AlertDialog.Builder(this);
        alert01.setTitle("計算結果");
        alert01.setMessage(i+"Aです");
        alert01.show();
    }
}

