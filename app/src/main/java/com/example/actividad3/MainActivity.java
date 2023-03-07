package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2, rb3,rb4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);
    }


    public void Operar (View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        if (rb1.isChecked()==true) {
            int suma=nro1+nro2;
            String result=String.valueOf(suma);
            tv1.setText(result);
        } else
        if (rb2.isChecked()==true) {
            int resta=nro1-nro2;
            String result=String.valueOf(resta);
            tv1.setText(result);
        }  else
        if (rb3.isChecked()==true) {
            int multiplica = nro1 * nro2;
            String result = String.valueOf(multiplica);
            tv1.setText(result);
        }
        else
        if (rb4.isChecked()==true) {
            int divide = nro1 / nro2;
            String result = String.valueOf(divide);
            tv1.setText(result);
        }

    }
}

