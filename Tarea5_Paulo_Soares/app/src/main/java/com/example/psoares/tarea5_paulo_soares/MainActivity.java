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

    // Creamos el boton calcular y el spinner
    Button botonCalcular;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazamos los objetos creados con la ui
        botonCalcular = findViewById(R.id.button_calcular);
        spinner = findViewById(R.id.spinner);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // cogemos el texto de la opcion seleccionada
                String elementoSeleccionado = spinner.getSelectedItem().toString();
                calcular(elementoSeleccionado);
            }
        });
    }



    public void calcular(String operacion){
        double calculo = 0;
        EditText campo1    = findViewById(R.id.campo1);
        EditText campo2    = findViewById(R.id.campo2);
        TextView resultado = findViewById(R.id.resultado);

        // Si los dos campos y no estan vacios
        // y si son mayor que 0
        if (campo1.getText().toString().length() > 0 && campo2.getText().toString().length() > 0 &&
            Float.parseFloat(campo1.getText().toString()) > 0 && Float.parseFloat(campo2.getText().toString()) > 0) {

            // segun la operacion seleccionar suma, resta, multiplica o divide
            switch (operacion){
                case "Sumar" :       calculo = Float.parseFloat(campo1.getText().toString()) + Float.parseFloat(campo2.getText().toString()); break;
                case "Restar" :      calculo = Float.parseFloat(campo1.getText().toString()) - Float.parseFloat(campo2.getText().toString()); break;
                case "Multiplicar" : calculo = Float.parseFloat(campo1.getText().toString()) * Float.parseFloat(campo2.getText().toString()); break;
                case "Dividir" :     calculo = Float.parseFloat(campo1.getText().toString()) / Float.parseFloat(campo2.getText().toString()); break;
                case "Potencia" :    calculo = Math.pow(Float.parseFloat(campo1.getText().toString()) , Float.parseFloat(campo2.getText().toString())); break;
            }
            resultado.setText("Resultado: "+ String.valueOf(calculo));
        } else{
            if (campo1.getText().toString().length() == 0 && campo2.getText().toString().length() == 0)
                Toast.makeText(getApplicationContext(), "Debe introducir algun numero en el campo 1 y 2", Toast.LENGTH_SHORT).show();

            if (Float.parseFloat(campo1.getText().toString()) > 0 && Float.parseFloat(campo2.getText().toString()) > 0)
                Toast.makeText(getApplicationContext(), "Los valores del campo1 y campo2 debe ser mayor que 0", Toast.LENGTH_SHORT).show();
        }
    }

}

