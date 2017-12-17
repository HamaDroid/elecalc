package com.hmdroid.elecalc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Voltage;
    EditText Intensity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registnce(View view) {
        Voltage = (EditText) findViewById(R.id.voltage);
        Intensity = (EditText) findViewById(R.id.intensity);

        int v = Integer.parseInt(Voltage.getText().toString());
        int i = Integer.parseInt(Intensity.getText().toString());
        int r = v/i;

    AlertDialog.Builder alert01 = new AlertDialog.Builder(this);
    alert01.setTitle("計算結果");
    alert01.setMessage(r+"Ωです");
    alert01.show();
    }
}