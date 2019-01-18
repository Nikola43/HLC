package com.example.psoares.tarea7_paulo_soares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageButton botonColgar, botonLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView    = findViewById(R.id.texto);
        botonColgar = findViewById(R.id.colgar);
        botonLlamar = findViewById(R.id.llamar);
    }

    public void llamar(View view){
        textView.setText("Llamando...");
        botonLlamar.setVisibility(View.INVISIBLE);
        botonColgar.setVisibility(View.VISIBLE);
    }

    public void colgar(View view){
        textView.setText("Fin de la llamada");
        botonLlamar.setVisibility(View.VISIBLE);
        botonColgar.setVisibility(View.INVISIBLE);
    }
}
