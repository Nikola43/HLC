package com.example.psoares.paulosoares_tarea6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //
    Map<String, Double> listaEquiposPresupuestos;
    TextView tv1;
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEquiposPresupuestos = new HashMap<String, Double>();

        listaEquiposPresupuestos.put("FC Barcelona", 897.0);
        listaEquiposPresupuestos.put("Real Madrid", 690.3);
        listaEquiposPresupuestos.put("Atlético de Madrid", 347.2);
        listaEquiposPresupuestos.put("Sevilla FC", 212.0);
        listaEquiposPresupuestos.put("Villareal CF", 117.0);
        listaEquiposPresupuestos.put("Athletic Club", 116.0);
        listaEquiposPresupuestos.put("Real Sociedad", 100.6);
        listaEquiposPresupuestos.put("Valencia", 91.9);
        listaEquiposPresupuestos.put("Real Betis", 87.67);
        listaEquiposPresupuestos.put("UD Las Palmas", 75.418);
        listaEquiposPresupuestos.put("Espayol", 74.6);
        listaEquiposPresupuestos.put("RC Celta", 68.0);
        listaEquiposPresupuestos.put("Málaga CF", 63.5);
        listaEquiposPresupuestos.put("Deportivo Alavés", 690.3);
        listaEquiposPresupuestos.put("Levante UD", 690.3);
        listaEquiposPresupuestos.put("Deportivo Leganés", 690.3);
        listaEquiposPresupuestos.put("Girona FC", 690.3);

        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, listaEquiposPresupuestos.keySet().toArray(new String[listaEquiposPresupuestos.keySet().size()]) );

        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                String texto = "El presupuesto de " + lv1.getItemAtPosition(i) + " es " + listaEquiposPresupuestos.values().toArray(new Double[listaEquiposPresupuestos.values().size()])[i] + " millones";
                tv1.setText(texto);
            }
        });
    }
}
