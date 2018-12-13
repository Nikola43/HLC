package com.example.psoares.tarea5_paulo_soares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonCalcular = findViewById(R.id.button_calcular);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner spinner = findViewById(R.id.spinner);
                String elementoSeleccionado = spinner.getSelectedItem().toString();
                calcular(elementoSeleccionado);
            }
        });
    }



    public void calcular(String operacion){
        float calculo = 0;
        EditText campo1    = findViewById(R.id.campo1);
        EditText campo2    = findViewById(R.id.campo2);
        TextView resultado = findViewById(R.id.resultado);

        if (campo1.getText().toString().length() > 0 && campo2.getText().toString().length() > 0){

            switch (operacion){
                case "Sumar" : calculo = Float.parseFloat(campo1.getText().toString()) + Float.parseFloat(campo2.getText().toString()); break;
                case "Restar" : calculo = Float.parseFloat(campo1.getText().toString()) - Float.parseFloat(campo2.getText().toString()); break;
                case "Multiplicar" : calculo = Float.parseFloat(campo1.getText().toString()) * Float.parseFloat(campo2.getText().toString()); break;
                case "Dividir" : calculo = Float.parseFloat(campo1.getText().toString()) / Float.parseFloat(campo2.getText().toString()); break;
            }
            resultado.setText(String.valueOf(calculo));
        } else{
            Toast.makeText(getApplicationContext(), "Debe introducir algun numero en el campo 1 y 2", Toast.LENGTH_SHORT).show();
        }
    }

}

