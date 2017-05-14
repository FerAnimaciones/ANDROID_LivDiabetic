package mx.com.livmsd.livdiabetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Medicinas extends AppCompatActivity {
ListView lisaMedcinas;
    MedicinaAdaptador adater;
    ArrayList<Medicina> elemento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicinas);
        lisaMedcinas=(ListView)findViewById(R.id.listaMedicinas);
        elemento = getElemento();
        adater = new MedicinaAdaptador(this, elemento);
        lisaMedcinas.setAdapter(adater);
    }
    private ArrayList<Medicina> getElemento() {
        ArrayList<Medicina> elementos = new ArrayList<Medicina>();
            elementos.add(new Medicina(0,"","5","@drawable/med1"));
        elementos.add(new Medicina(1,"","5","@drawable/diabetex"));
        elementos.add(new Medicina(2,"","5","@drawable/diabetex"));
        elementos.add(new Medicina(3,"","5","@drawable/diabetex"));
        return elementos;
    }
}

