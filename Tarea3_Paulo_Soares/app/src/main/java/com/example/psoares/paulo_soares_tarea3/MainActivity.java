package com.example.psoares.paulo_soares_tarea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    char operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butonCalcular = findViewById(R.id.button_calcular);
        butonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular(operacion);
            }
        });

    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButtonSumar:
                if (checked)
                    operacion = '+';
                    break;
            case R.id.radioButtonRestar:
                if (checked)
                    operacion = '-';
                    break;
            case R.id.radioButtonMultiplicar:
                if (checked)
                    operacion = '*';
                    break;
            case R.id.radioButtonDividir:
                if (checked)
                    operacion = '/';
                    break;
        }
    }

    public void calcular(char operacion){
        float calculo = 0;
        EditText campo1    = findViewById(R.id.campo1);
        EditText campo2    = findViewById(R.id.campo2);
        TextView resultado = findViewById(R.id.resultado);

        if (campo1.getText().toString().length() > 0 && campo2.getText().toString().length() > 0){

            switch (operacion){
                case '+' : calculo = Float.parseFloat(campo1.getText().toString()) + Float.parseFloat(campo2.getText().toString()); break;
                case '-' : calculo = Float.parseFloat(campo1.getText().toString()) - Float.parseFloat(campo2.getText().toString()); break;
                case '*' : calculo = Float.parseFloat(campo1.getText().toString()) * Float.parseFloat(campo2.getText().toString()); break;
                case '/' : calculo = Float.parseFloat(campo1.getText().toString()) / Float.parseFloat(campo2.getText().toString()); break;
            }
            resultado.setText(String.valueOf(calculo));
        } else{
            Toast.makeText(getApplicationContext(), "Debe introducir algun numero en el campo 1 y 2", Toast.LENGTH_SHORT).show();
        }
    }
}
