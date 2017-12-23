package com.hmdroid.elecalc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;

public class calculate_voltage extends AppCompatActivity {

    EditText Resistance;
    EditText Intensity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_voltage);
    }

    public void voltage (View view){
        Resistance = (EditText)findViewById(R.id.resistance);
        Intensity=(EditText)findViewById(R.id.intensity);

        BigDecimal r =new
                BigDecimal(Resistance.getText().toString());
        BigDecimal i = new
                BigDecimal(Intensity.getText().toString());
        double v = r.multiply(i).doubleValue();


        AlertDialog.Builder alert01 = new AlertDialog.Builder(this);
        alert01.setTitle("計算結果");
        alert01.setMessage(v+"Vです");
        alert01.show();
    }
}