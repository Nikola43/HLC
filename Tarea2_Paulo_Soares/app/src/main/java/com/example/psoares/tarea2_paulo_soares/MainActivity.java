package com.example.psoares.tarea2_paulo_soares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View v){
        EditText campo1    = findViewById(R.id.campo1);
        EditText campo2    = findViewById(R.id.campo2);
        TextView resultado = findViewById(R.id.resultado);

        if (campo1.getText().toString().length() > 0 && campo2.getText().toString().length() > 0){
            float calculo = Float.parseFloat(campo1.getText().toString()) + Float.parseFloat(campo2.getText().toString());
            resultado.setText(String.valueOf(calculo));
        } else{
            Toast.makeText(getApplicationContext(), "Debe introducir algun numero en el campo 1 y 2", Toast.LENGTH_SHORT).show();
        }
    }
    public void restar(View v){
        EditText campo1    = findViewById(R.id.campo1);
        EditText campo2    = findViewById(R.id.campo2);
        TextView resultado = findViewById(R.id.resultado);

        if (campo1.getText().toString().length() > 0 && campo2.getText().toString().length() > 0){
            float calculo = Float.parseFloat(campo1.getText().toString()) - Float.parseFloat(campo2.getText().toString());
            resultado.setText(String.valueOf(calculo));
        } else{
            Toast.makeText(getApplicationContext(), "Debe introducir algun numero en el campo 1 y 2", Toast.LENGTH_SHORT).show();
        }
    }
    public void multiplicar(View v){
        EditText campo1    = findViewById(R.id.campo1);
        EditText campo2    = findViewById(R.id.campo2);
        TextView resultado = findViewById(R.id.resultado);

        if (campo1.getText().toString().length() > 0 && campo2.getText().toString().length() > 0){
            float calculo = Float.parseFloat(campo1.getText().toString()) * Float.parseFloat(campo2.getText().toString());
            resultado.setText(String.valueOf(calculo));
        } else{
            Toast.makeText(getApplicationContext(), "Debe introducir algun numero en el campo 1 y 2", Toast.LENGTH_SHORT).show();
        }
    }
}
