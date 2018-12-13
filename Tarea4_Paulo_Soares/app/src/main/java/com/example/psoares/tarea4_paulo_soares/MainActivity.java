package com.example.psoares.tarea4_paulo_soares;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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

    public void oncheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkBoxSumar:
                if (checked)
                    operacion = '+';
                break;
            case R.id.checkBoxRestar:
                if (checked)
                    operacion = '-';
                break;
            case R.id.checkBoxMultiplicar:
                if (checked)
                    operacion = '*';
                break;
            case R.id.checkBoxDividir:
                if (checked)
                    operacion = '/';
                break;
        }
    }

    public void calcular(char operacion){
        float calculo = 0;
        EditText campo1    = findViewById(R.id.campo1);
        EditText campo2    = findViewById(R.id.campo2);
        TextView resultadoSuma = findViewById(R.id.resultadoSuma);
        TextView resultadoResta = findViewById(R.id.resultadoResta);
        TextView resultadoMultiplicacion = findViewById(R.id.resultadoMultiplicacion);
        TextView resultadoDivision = findViewById(R.id.resultadoDivision);

        if (campo1.getText().toString().length() > 0 && campo2.getText().toString().length() > 0){
            switch (operacion){
                case '+' : calculo = Float.parseFloat(campo1.getText().toString()) + Float.parseFloat(campo2.getText().toString());
                    resultadoSuma.setText("Resultado de la suma: " + String.valueOf(calculo));
                break;
                case '-' : calculo = Float.parseFloat(campo1.getText().toString()) - Float.parseFloat(campo2.getText().toString());
                    resultadoResta.setText("Resultado de la resta: " + String.valueOf(calculo));
                break;
                case '*' : calculo = Float.parseFloat(campo1.getText().toString()) * Float.parseFloat(campo2.getText().toString());
                    resultadoMultiplicacion.setText("Resultado de la multiplicacion: " + String.valueOf(calculo));
                break;
                case '/' : calculo = Float.parseFloat(campo1.getText().toString()) / Float.parseFloat(campo2.getText().toString());
                    resultadoDivision.setText("Resultado de la division: " + String.valueOf(calculo));
                break;
            }
        } else{
            Toast.makeText(getApplicationContext(), "Debe introducir algun numero en el campo 1 y 2", Toast.LENGTH_SHORT).show();
        }
    }
}
